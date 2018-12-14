package pcf.demo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pcf.demo.bean.TeamBean;
import pcf.demo.dao.TeamDAO;
import pcf.demo.respository.TeamRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository repo;

    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<TeamBean> getAll() {
        List<TeamDAO> daoList = new ArrayList<>();
        repo.findAll().forEach(daoList::add);
        return daoList.stream()
                .map(this::convertToBean)
                .collect(Collectors.toList());
    }

    public TeamBean convertToBean(TeamDAO dao) {
        return modelMapper.map(dao, TeamBean.class);
    }

    public TeamDAO convertToDAO(TeamBean bean){
        return modelMapper.map(bean, TeamDAO.class);
    }
}
