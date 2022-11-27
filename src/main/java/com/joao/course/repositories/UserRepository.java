package com.joao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
