package com.testing.rojgar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testing.rojgar.model.UserRegistration;
import com.testing.rojgar.service.UserRegistrationService;

/**
 ** Author: Santosh Paudel
 **/

@RestController
@RequestMapping("/api")
public class UserRegistrationController {

	@Autowired
	private UserRegistrationService userRegistrationService;

	@RequestMapping(value = "/test")
	public String testing() {
		return "This is testing";
	}

//	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@PostMapping("/addUser")
	public UserRegistration saveRegistration(@RequestBody UserRegistration userRegistration) {
		UserRegistration savedUserRegistration = null;
		try {
			savedUserRegistration = userRegistrationService.saveUserRegistration(userRegistration);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return savedUserRegistration;
	}

//	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	@PutMapping("/updateUser")
	public UserRegistration updateRegistration(@RequestBody UserRegistration userRegistration) {
		UserRegistration savedUserRegistration = null;
		try {
			savedUserRegistration = userRegistrationService.saveUserRegistration(userRegistration);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return savedUserRegistration;
	}

//	@RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
	@GetMapping("/getUserByUserName/{userName}")
	public UserRegistration getUserRegistrationByUserName(@PathVariable String userName) {

		UserRegistration userRegistration = null;
		try {
			userRegistration = userRegistrationService.getUserRegistrationByUserName(userName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userRegistration;
	}

//	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	@GetMapping("/getAllUser")
	public List<UserRegistration> getAllUserRegistration() {

		List<UserRegistration> userRegistration = null;
		try {
			userRegistration = userRegistrationService.getAllUserRegistration();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userRegistration;
	}
}