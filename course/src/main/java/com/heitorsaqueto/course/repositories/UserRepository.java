package com.heitorsaqueto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heitorsaqueto.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
