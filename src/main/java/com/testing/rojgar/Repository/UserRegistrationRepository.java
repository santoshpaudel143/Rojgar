package com.testing.rojgar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testing.rojgar.model.UserRegistration;

/**
 ** Author: Santosh Paudel
 **/

public interface UserRegistrationRepository extends JpaRepository<UserRegistration, Integer> {

	UserRegistration findByUserName(String userName);

}
