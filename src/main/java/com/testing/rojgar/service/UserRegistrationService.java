package com.testing.rojgar.service;

import java.util.List;

import com.testing.rojgar.model.UserRegistration;

/**
 ** Author: Santosh Paudel
 **/

public interface UserRegistrationService {

	// saveUserRegistration
	public UserRegistration saveUserRegistration(UserRegistration userRegistration) throws Exception;
	
	// updateUserRegistration
	public UserRegistration updateUserRegistration(UserRegistration userRegistration) throws Exception;

	// getUserRegistrationByUserName
	public UserRegistration getUserRegistrationByUserName(String userName) throws Exception;

	// getAllUserRegistration
	public List<UserRegistration> getAllUserRegistration() throws Exception;

}
