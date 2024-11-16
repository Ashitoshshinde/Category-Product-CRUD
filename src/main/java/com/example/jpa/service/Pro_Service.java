package com.example.jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpa.entity.Product;
import com.example.jpa.repository.Pro_Repository;

@Service
public class Pro_Service {

	@Autowired
	Pro_Repository pr;

	public void createProduct(Product product) {
		pr.save(product);
	}

	public Optional<Product> getById(Integer pid) {
		return pr.findById(pid);
	}

	public void update_Product(int pid, Product updateProduct) {
		Product product = pr.findById(pid).orElseThrow(() -> new RuntimeException("Not found"));
		product.setPname(updateProduct.getPname());
		pr.save(product);
	}

	public void deleteById(int pid) {
		pr.deleteById(pid);
	}
}
