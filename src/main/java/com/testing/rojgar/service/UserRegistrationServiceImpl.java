package com.testing.rojgar.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing.rojgar.Repository.UserRegistrationRepository;
import com.testing.rojgar.model.UserRegistration;

/**
 ** Author: Santosh Paudel
 **/

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	private UserRegistrationRepository userRegistrationRepository;

	@Override
	public UserRegistration saveUserRegistration(UserRegistration userRegistration) throws Exception {
//		userRegistration.setCreated_in(Timestamp.valueOf(String.valueOf(new Date())));
		UserRegistration savedUserRegistration = userRegistrationRepository.save(userRegistration);
		return savedUserRegistration;
	}

	@Override
	public UserRegistration updateUserRegistration(UserRegistration userRegistration) throws Exception {
		UserRegistration existingUserRegistration = userRegistrationRepository.findById(userRegistration.getId())
				.orElse(null);
		existingUserRegistration.setAddress(userRegistration.getAddress());
		existingUserRegistration.setContact(userRegistration.getContact());
		existingUserRegistration.setDateOfBirth(userRegistration.getDateOfBirth());
		existingUserRegistration.setEmail(userRegistration.getEmail());
//		existingUserRegistration.setCreated_in(existingUserRegistration.getCreated_in());
		existingUserRegistration.setFullName(userRegistration.getFullName());
		existingUserRegistration.setGender(userRegistration.getGender());
		existingUserRegistration.setPassword(userRegistration.getPassword());
		existingUserRegistration.setStatus(userRegistration.isStatus());
		existingUserRegistration.setUserName(userRegistration.getUserName());

		UserRegistration updatedUserRegistration = userRegistrationRepository.save(existingUserRegistration);

		return updatedUserRegistration;
	}

	@Override
	public UserRegistration getUserRegistrationByUserName(String userName) throws Exception {
		UserRegistration userRegistration = userRegistrationRepository.findByUserName(userName);
		return userRegistration;
	}

	@Override
	public List<UserRegistration> getAllUserRegistration() throws Exception {
		List<UserRegistration> userRegistrationList = userRegistrationRepository.findAll();
		return userRegistrationList;
	}
}