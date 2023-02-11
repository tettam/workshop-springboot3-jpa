package com.portfolio.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.course.entities.User;
import com.portfolio.course.repositories.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository repository;
  
  public List<User> findAll(){
    return repository.findAll();
  }

  public User findById(Long id){
    Optional<User> user = repository.findById(id);
    return user.get();
     
  }
}
