package pcf.demo.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pcf.demo.dao.TeamDAO;

import java.util.List;

@Repository
public interface TeamRepository extends CrudRepository {

    List<TeamDAO> findAll();
}
