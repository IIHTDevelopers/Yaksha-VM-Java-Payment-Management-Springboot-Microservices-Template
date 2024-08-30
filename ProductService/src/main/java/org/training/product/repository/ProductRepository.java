package org.training.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.training.product.model.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
