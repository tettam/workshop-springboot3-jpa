package com.portfolio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {}
