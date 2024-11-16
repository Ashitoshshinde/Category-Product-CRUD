package com.example.jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.jpa.entity.Category;
import com.example.jpa.repository.Category_Repo;

@Service
public class Category_Service {

	@Autowired
	Category_Repo cp;

	public void createCategory(Category category) {
		cp.save(category);
	}

	public Optional<Category> getbyId(int id) {
		return cp.findById(id);
	}

	public void deleteCategory(int id) {
		cp.deleteById(id);
	}

	public void uCategory(int id, Category updateCategory) {
		Category cat = cp.findById(id).orElseThrow(() -> new RuntimeException("Category Not Found"));
		cat.setName(updateCategory.getName());
		cp.save(cat);
	}

}
