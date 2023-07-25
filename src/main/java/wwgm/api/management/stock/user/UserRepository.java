package wwgm.api.management.stock.user;

import org.springframework.data.jpa.repository.JpaRepository;

import wwgm.api.management.stock.product.ProductEntity;

public interface UserRepository extends JpaRepository<ProductEntity, Long> {

}