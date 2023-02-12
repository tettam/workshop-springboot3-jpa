package com.portfolio.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.course.entities.Category;
import com.portfolio.course.repositories.CategoryRepository;

@Service
public class CategoryService {
  
  @Autowired
  private CategoryRepository repository;

  public List<Category> findAll(){
    return repository.findAll();
  }

  public Category findById(Long id) {
    Optional<Category> category = repository.findById(id);
    return category.get();
  }
}
