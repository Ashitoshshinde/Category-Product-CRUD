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

import com.example.jpa.entity.Category;
import com.example.jpa.service.Category_Service;

@RestController
public class Category_Controller {

	@Autowired
	Category_Service cs;
	
	@PostMapping("/create-category")
	public String create(@RequestBody Category category)
	{
		cs.createCategory(category);
		return "Category Created";
	}
	
	@GetMapping("/get-category-by-id/{id}")
	public Optional<Category> getById(@PathVariable int id)
	{
		return cs.getbyId(id);
	}
	
	@DeleteMapping("/delete-category/{id}")
	public String delete(@PathVariable int id)
	{
		cs.deleteCategory(id);
		return "category deleted successfully";
	}
	
	
	@PutMapping("/update-category/{id}")
	public String update(@PathVariable int id,@RequestBody Category updateCategory)
	{
		cs.uCategory(id,updateCategory);
		return"Category Updated Successfully";
	}
	
}
