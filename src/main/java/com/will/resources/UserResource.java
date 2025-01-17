package com.will.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.will.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User teste = new User("1", "Maria Brown", "maria@gmail.com");
		User test2 = new User("2", "Alex Green", "alex@gmail.com");

		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(teste, test2));

		return ResponseEntity.ok().body(list);
	}

}
