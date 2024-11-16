package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.entity.Product;

@Repository
public interface Pro_Repository extends JpaRepository<Product, Integer>{

}
