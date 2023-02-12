package com.educandoweb_breno.course.breno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb_breno.course.breno.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
