package Repository;

import Domain.BarCodeRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = false)
public interface BarCodeRecordRepo extends JpaRepository<BarCodeRecord,Integer> {

}
