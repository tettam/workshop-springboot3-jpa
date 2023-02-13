package com.portfolio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}