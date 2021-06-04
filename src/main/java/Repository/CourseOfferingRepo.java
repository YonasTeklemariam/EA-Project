package Repository;

import Domain.CourseOffering;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = false)
public interface CourseOfferingRepo extends JpaRepository<CourseOffering,Integer> {
}
