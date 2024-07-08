package com.example.demo_mapstruct.repository;

import com.example.demo_mapstruct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

    Product findByDescription(String description);
}
