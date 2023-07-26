package wwgm.api.management.stock.general.launch;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import wwgm.api.management.stock.product.ProductEntity;
import wwgm.api.management.stock.user.UserEntity;

@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class LaunchMain {

    @EqualsAndHashCode.Include
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private ProductEntity product;
    private UserEntity client;
    private int typeOrder;
    private int typePayment;
    private LocalDate dateHourLaunch;
	
    public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public ProductEntity getProduct() {
		return product;
	}
	
	public void setProduct(ProductEntity product) {
		this.product = product;
	}
	
	public UserEntity getClient() {
		return client;
	}
	
	public void setClient(UserEntity client) {
		this.client = client;
	}
	
	public int getTypeOrder() {
		return typeOrder;
	}
	
	public void setTypeOrder(int typeOrder) {
		this.typeOrder = typeOrder;
	}
	
	public LocalDate getDateHourLaunch() {
		return dateHourLaunch;
	}
	
	public void setDateHourLaunch(LocalDate dateHourLaunch) {
		this.dateHourLaunch = dateHourLaunch;
	}

	public int getTypePayment() {
		return typePayment;
	}

	public void setTypePayment(int typePayment) {
		this.typePayment = typePayment;
	}
    

}
