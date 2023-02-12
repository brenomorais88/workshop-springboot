package com.educandoweb_breno.course.breno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb_breno.course.breno.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
