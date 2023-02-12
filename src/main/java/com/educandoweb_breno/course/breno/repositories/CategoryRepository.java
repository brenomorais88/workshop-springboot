package com.educandoweb_breno.course.breno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb_breno.course.breno.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}
