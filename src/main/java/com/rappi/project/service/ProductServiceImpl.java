// Java Program to Illustrate DepartmentServiceImpl.java
// File

// Importing required packages
package com.rappi.project.service;

import com.rappi.project.entity.Product;
import com.rappi.project.repository.ProductRepository;

// Importing required classes
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service
// Class implementing DepartmentService class
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	// Save operation
	@Override
	public Product saveProduct(Product product)
	{
		return productRepository.save(product);
	}
	
	// Read operation
	@Override public List<Product> fetchProductList()
	{
		return (List<Product>)
			productRepository.findAll();
	}
	
	// Read operation
    @Override public Product getProduct(Long id)
    {
        return productRepository.findById(id).get();
    }

	// Update operation
	@Override
	public Product updateProduct(Product product,Long id)
	{

		Product producto = productRepository.findById(id).get();

		if (Objects.nonNull(product.getNombre())
			&& !"".equalsIgnoreCase(
					product.getNombre())) {
						product.setNombre(
							product.getNombre());
		}

		if (Objects.nonNull(
			product.getDescripcion())
			&& !"".equalsIgnoreCase(
				product.getDescripcion())) {
					product.setDescripcion(
						product.getDescripcion());
		}
		return productRepository.save(producto);
	}

	// Delete operation
	@Override
	public void deleteProductById(Long id)
	{
		productRepository.deleteById(id);
	}
}
