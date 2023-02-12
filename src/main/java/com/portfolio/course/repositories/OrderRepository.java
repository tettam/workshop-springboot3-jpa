package com.portfolio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {}
