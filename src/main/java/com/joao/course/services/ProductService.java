package com.joao.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.joao.course.entities.Product;
import com.joao.course.repositories.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductService {
	private final ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
