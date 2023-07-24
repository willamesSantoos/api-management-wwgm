package wwgm.api.management.stock.user;

import wwgm.api.management.stock.product.ProductEntity;
import wwgm.api.management.stock.repository.CrudRepository;

public interface UserRepository extends CrudRepository<ProductEntity, Long> {

}