package wwgm.api.management.stock.product;

public record ProductDTO (Long id, String description, Double value, int quantity) {
	public ProductDTO (ProductEntity product) {
		this(product.getId(), product.getDescription(), product.getValue(), product.getQuantity());
	}
}
