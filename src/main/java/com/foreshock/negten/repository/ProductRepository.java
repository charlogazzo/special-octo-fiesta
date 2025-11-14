package com.foreshock.negten.repository;

import com.foreshock.negten.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
