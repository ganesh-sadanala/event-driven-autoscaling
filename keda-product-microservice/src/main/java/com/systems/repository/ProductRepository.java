package com.systems.repository;

import com.systems.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional methods for custom queries if needed
}

