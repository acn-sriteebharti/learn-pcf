package pcf.demo.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pcf.demo.dao.MembersDAO;

@Repository
public interface MemberRepository extends CrudRepository<MembersDAO, Integer> {
}
