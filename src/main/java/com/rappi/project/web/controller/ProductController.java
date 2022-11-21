// Java Program to Illustrate DepartmentController.java File

// Importing packages modules
package com.rappi.project.web.controller;

import com.rappi.project.entity.Product;
import com.rappi.project.service.ProductService;
import java.util.List;

// Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Validate origin
@CrossOrigin(origins = {"http://localhost:8080"})

// Annotation
@RestController
// Class
public class ProductController {

	@Autowired private ProductService productService;

	// Save operation
	@PostMapping("/api/productos")
	public Product saveProduct(@RequestBody Product product)
	{
		return productService.saveProduct(product);
	}

	// Read operation
	@GetMapping("/api/productos")

	public List<Product> fetchProductList()
	{
		return productService.fetchProductList();
	}
	
	// Read operation
    @GetMapping("/api/productos/{id}")

    public Product getProduct(@PathVariable("id") Long id)
    {
        return productService.getProduct(id);
    }

	// Update operation
	@PutMapping("/api/productos/{id}")

	public Product
	updateProduct(@RequestBody Product product,
					@PathVariable("id") Long id)
	{
		return productService.updateProduct(
			product, id);
	}

	// Delete operation
	@DeleteMapping("/api/productos/{id}")

	public String deleteProductById(@PathVariable("id")
									Long id)
	{
		productService.deleteProductById(
			id);
		return "Deleted Successfully";
	}

}
