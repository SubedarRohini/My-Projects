package com.rest.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.rest.Entity.ProductEntity;
public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

}
