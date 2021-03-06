package Repository;

import Domain.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = false)
public interface LocationRepo extends JpaRepository<Location,Integer> {
    boolean existsByBuildingAndRoomNumber(String building, String roomNumber);
    Location findByBuildingAndRoomNumber(String building, String roomNumber);
}
