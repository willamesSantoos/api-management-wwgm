package wwgm.api.management.stock.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "product")
public class ProductEntity {
	private static final long serialVersionUID = 1L;

    @EqualsAndHashCode.Include
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
    private String description;
	
	@Column
    private Double value;
	
	@Column
    private int quantity;
}
