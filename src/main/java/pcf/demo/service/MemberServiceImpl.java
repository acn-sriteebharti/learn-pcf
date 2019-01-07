package pcf.demo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pcf.demo.bean.MemberBean;
import pcf.demo.dao.MembersDAO;
import pcf.demo.respository.MemberRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberRepository repo;

    private final ModelMapper modelMapper = new ModelMapper();

    public List<MemberBean> getAll() {
        List<MembersDAO> daoList = new ArrayList<>();
        repo.findAll().forEach(daoList::add);
        return daoList.stream()
                .map(this::convertToBean)
                .collect(Collectors.toList());
    }


    public MemberBean convertToBean(MembersDAO dao) {
        return modelMapper.map(dao, MemberBean.class);
    }

    public MembersDAO convertToDAO(MemberBean bean){
        return modelMapper.map(bean, MembersDAO.class);
    }

}
