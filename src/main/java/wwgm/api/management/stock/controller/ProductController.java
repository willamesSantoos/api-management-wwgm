package wwgm.api.management.stock.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.util.Streamable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import wwgm.api.management.stock.product.ProductRepository;
import wwgm.api.management.stock.product.ProductEntity;
import wwgm.api.management.stock.product.ProductDTO;

@RestController
@RequestMapping("/api/management-stock/v1/produc")
public class ProductController {

	@Autowired
	ProductRepository pRepository;
	
	@GetMapping
	public Page<ProductDTO> findAllProduct (Pageable pageable) {		
		return pRepository.findAll(pageable).map(ProductDTO::new);   
	}

	
	@GetMapping("/{id}")
	public ProductDTO findProduct (@PathVariable("id") Long id) {		
		Optional<ProductEntity> optionalProduct = pRepository.findById(id);
	    ProductEntity productEntity = optionalProduct.orElse(null);
		
		return productEntity == null ? null : new ProductDTO(optionalProduct.get());
	}
	
	@PostMapping
	@Transactional
	public void createProduct (@RequestBody ProductDTO produc) {
		pRepository.save(new ProductEntity(produc));
	}	
	
	@PutMapping
	@Transactional
	public ResponseEntity<ProductEntity> editProduct (@RequestBody ProductDTO producDTO) {
		 Optional<ProductEntity> optionalProduct = pRepository.findById(producDTO.id());

		 if (optionalProduct.isPresent()) {
			 ProductEntity productEntity = optionalProduct.get();
			 
			 productEntity.setId(producDTO.id());
			 productEntity.setDescription(producDTO.description());
			 productEntity.setValue(producDTO.value());
			 productEntity.setQuantity(producDTO.quantity());

	         return ResponseEntity.ok(productEntity);
	     } else {
	         return ResponseEntity.notFound().build();
	     }
	}
	
}
