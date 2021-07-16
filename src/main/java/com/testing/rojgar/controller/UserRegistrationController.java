package com.testing.rojgar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.testing.rojgar.Repository.UserRegistrationRepository;
import com.testing.rojgar.model.UserRegistration;

/**
 ** Author: Santosh Paudel
 **/

@RestController
@RequestMapping("/api")
public class UserRegistrationController {

	@Autowired
	UserRegistrationRepository userRegistrationRepository;
	
	@RequestMapping(value = "/test")
	public String testing() {
		return "This is testing";
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public UserRegistration getNameById(@PathVariable("id") Integer id) {

		UserRegistration UserRegistration = userRegistrationRepository.findById(id).orElse(null);
		return UserRegistration;
	}
}