package com.joao.course.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joao.course.entities.User;

@RestController
@RequestMapping("/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> index() {
		User u = new User(1L, "João Victor", "joao.dipaay@gmail.com", "1199999999", "12345678");
		return ResponseEntity.status(HttpStatus.OK).body(u);
		
	}
	
}
