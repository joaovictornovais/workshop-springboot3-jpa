package com.joao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
