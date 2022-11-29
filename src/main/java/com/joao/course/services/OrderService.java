package com.joao.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.joao.course.entities.Order;
import com.joao.course.repositories.OrderRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderService {
	private final OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
