 package com.heitorsaqueto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heitorsaqueto.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
