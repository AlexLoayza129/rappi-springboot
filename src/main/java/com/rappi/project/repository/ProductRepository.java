package com.rappi.project.repository;
 
import com.rappi.project.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
}