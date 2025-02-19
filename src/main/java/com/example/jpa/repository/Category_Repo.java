package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.entity.Category;

@Repository
public interface Category_Repo extends JpaRepository<Category, Integer> {

}
