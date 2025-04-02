package com.carrefour.carrefour_kata.repository;

import com.carrefour.carrefour_kata.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
