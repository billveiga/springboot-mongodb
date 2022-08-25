package com.bill.workshopmongo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bill.workshopmongo.domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	@GetMapping
	public List<User> findAll(){
		User user1 = new User("01", "Fulano de Tal", "fulano@detal.com");
		User user2 = new User("02", "Beltrano Useral", "beltrano@detal.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(user1, user2));
		return list;
	}
}

