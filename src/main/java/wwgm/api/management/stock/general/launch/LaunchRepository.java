package wwgm.api.management.stock.general.launch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaunchRepository extends JpaRepository<LaunchMain, Long>{

}
