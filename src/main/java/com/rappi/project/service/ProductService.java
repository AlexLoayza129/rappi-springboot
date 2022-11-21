package com.rappi.project.service;

// Importing required classes
import java.util.List;
import com.rappi.project.entity.Product;

public interface ProductService {
     // Save operation
	Product saveProduct(Product product);
 
    // Read operation
    List<Product> fetchProductList();
 
    // Update operation
    Product updateProduct(Product product, Long id);
 
    // Delete operation
    void deleteProductById(Long id);

    Product getProduct(Long id);
}
