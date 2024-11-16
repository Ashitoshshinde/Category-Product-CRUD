package com.example.jpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.entity.Product;
import com.example.jpa.service.Pro_Service;

@RestController
public class Product_Controller {

	@Autowired
	Pro_Service ps;
	
	@PostMapping("create-product")
	public String createProduct(@RequestBody Product product)
	{
		ps.createProduct(product);
		return "Product Created Successfully";
	}
	
	@GetMapping("/get-product-by-id/{pid}")
	public Optional<Product> getById(@PathVariable Integer pid)
	{
		return ps.getById(pid);
	}
	
	@PutMapping("/update-product/{pid}")
	public String update_product(@PathVariable int pid,@RequestBody Product updateProduct)
	{
		ps.update_Product(pid,updateProduct);
		return "Product Update Successfully";
	}
	
	@DeleteMapping("/delete-product-by-id/{pid}")
	public String deletePro(@PathVariable int pid)
	{
		ps.deleteById(pid);
		return "product deleted successfully";
	}
}
