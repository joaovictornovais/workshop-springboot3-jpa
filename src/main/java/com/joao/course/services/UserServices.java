package com.joao.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.joao.course.entities.User;
import com.joao.course.repositories.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServices {
	private final UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
