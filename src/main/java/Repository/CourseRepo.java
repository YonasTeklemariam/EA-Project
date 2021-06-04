package Repository;

import Domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = false)
public interface CourseRepo extends JpaRepository<Course,Integer> {
    boolean existsByCode(String code);
    Course findByCode(String code);
}
