package wwgm.api.management.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wwgm.api.management.stock.product.ProductEntity;

@RestController
@RequestMapping("/api/management-stock/v1/produc")
public class ProductController {

	@GetMapping
	public void findAllProduct () {
			
	}
	
	@PostMapping
	public void createProduct (@RequestBody ProductEntity produc) {
		System.out.println(produc);
	}	
}
