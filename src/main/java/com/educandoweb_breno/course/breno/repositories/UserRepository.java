package com.educandoweb_breno.course.breno.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb_breno.course.breno.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
