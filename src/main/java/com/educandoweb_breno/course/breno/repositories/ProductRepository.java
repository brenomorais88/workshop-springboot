package com.educandoweb_breno.course.breno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb_breno.course.breno.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
