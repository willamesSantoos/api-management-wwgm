package wwgm.api.management.stock.general.launch;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class LaunchService {

	@Autowired
	LaunchRepository repository;

	public List<LaunchMain> findAll(Pageable pageable) {
		return repository.findAll();
	}

	public Optional<LaunchMain> findById(Long id) {
		return repository.findById(id);
	}

	public void save(LaunchMain launch) {
		repository.save(launch);
		
	}
}
