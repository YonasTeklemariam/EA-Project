package Repository;

import Domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = false)
public interface StudentRepo extends JpaRepository<Student,Integer> {
    Student findByStudentId(String studentId);
    boolean existsByStudentId(String studentId);
}
