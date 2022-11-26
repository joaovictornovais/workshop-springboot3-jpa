package com.joao.course.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	

	@EqualsAndHashCode.Include
	private Long id;
	
	private String name;
	
	private String email;
	
	private String phone;
	
	private String password;
	
	
	
}
