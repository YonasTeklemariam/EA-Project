package Repository;

import Domain.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = false)
public interface FacultyRepo extends JpaRepository<Faculty,Integer> {
    Faculty findByEmailAddress(String email);
    boolean existsByEmailAddress(String email);
}
