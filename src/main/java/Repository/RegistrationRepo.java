package Repository;

import Domain.Registration;
import Domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = false)
public interface RegistrationRepo extends JpaRepository<Registration,Integer> {
    boolean existsByStudent(Student student);
    Registration findByStudent(Student student);
}
