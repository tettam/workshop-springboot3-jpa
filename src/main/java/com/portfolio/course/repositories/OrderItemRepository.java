package com.portfolio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}
