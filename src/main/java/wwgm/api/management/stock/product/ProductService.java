package wwgm.api.management.stock.product;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository pRepository;

	public Page<ProductDTO> findAll(Pageable pageable) {
		return pRepository.findAll(pageable).map(ProductDTO::new);
	}

	public Optional<ProductEntity> findById(Long id) {
		return pRepository.findById(id);
	}

	public void save(ProductEntity productEntity) {
		pRepository.save(productEntity);
		
	}

}
