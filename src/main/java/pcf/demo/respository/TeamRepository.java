package pcf.demo.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pcf.demo.dao.TeamDAO;

@Repository
public interface TeamRepository extends CrudRepository<TeamDAO, Integer> {

//    List<TeamDAO> findAll();
}
