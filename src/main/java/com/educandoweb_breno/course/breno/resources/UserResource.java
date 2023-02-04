package com.educandoweb_breno.course.breno.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.educandoweb_breno.course.breno.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1l, "Breno", "email", "293920-3200", "dsdsdsdsds");
		return ResponseEntity.ok().body(u);
	}
}