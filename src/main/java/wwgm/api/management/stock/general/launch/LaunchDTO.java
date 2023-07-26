package wwgm.api.management.stock.general.launch;

import wwgm.api.management.stock.product.ProductEntity;

public record LaunchDTO (Long id, String description, Double value, int quantity) {
	public LaunchDTO (ProductEntity product) {
		this(product.getId(), product.getDescription(), product.getValue(), product.getQuantity());
	}
}
