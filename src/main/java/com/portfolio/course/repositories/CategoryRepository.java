package com.portfolio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category , Long> {}
