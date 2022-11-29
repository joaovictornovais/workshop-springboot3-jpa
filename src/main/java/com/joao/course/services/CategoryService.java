package com.joao.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.joao.course.entities.Category;
import com.joao.course.repositories.CategoryRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryService {
	private final CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
