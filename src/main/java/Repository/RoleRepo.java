package Repository;

import Domain.Role;
import Domain.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = false)
public interface RoleRepo extends JpaRepository<Role,Integer> {
    boolean existsRoleByType(RoleType roleType);
}
