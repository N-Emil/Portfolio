package com.pragmatech.productcrud.repository;

import com.pragmatech.productcrud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
    // Custom query methods
    List<Product> findByCategory(String category);
    
    List<Product> findByNameContainingIgnoreCase(String name);
}
