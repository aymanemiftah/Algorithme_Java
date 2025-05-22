package com.databasespring.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.databasespring.demo.Model.Product;

public interface ProductRepository extends JpaRepository<Product , Integer > {
    
}
