package com.testing.rojgar.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.testing.rojgar.model.UserRegistration;

/**
 ** Author: Santosh Paudel
 **/

public interface UserRegistrationRepository extends CrudRepository<UserRegistration, Integer> {

}
