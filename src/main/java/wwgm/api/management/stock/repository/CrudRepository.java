package wwgm.api.management.stock.repository;

import java.awt.print.Pageable;
import java.io.Serializable;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CrudRepository <T, ID extends Serializable> extends JpaRepository<T, ID> {
                                                                                                                   
	<S extends T> S save(S entity);
	
	T findOne(ID primaryKey);
   
	List<T> findAll();
	
	List<T> findSort(Sort sort);

	Page<T> findAll(Pageable pageable);

	long count();
                                                                                                                  
	void deletar(T entity);
	
	boolean exist(ID primaryKey);
}
