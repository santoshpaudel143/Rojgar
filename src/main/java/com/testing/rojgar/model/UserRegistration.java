package com.testing.rojgar.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import com.testing.rojgar.utill.TableColumnNameConstants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 ** Author: Santosh Paudel
 **/

@Data // writs getter/setter
@AllArgsConstructor // constructor with all args
@NoArgsConstructor // super constructor
@Entity // define this class as table
@Table(name = TableColumnNameConstants.USER_REGISTRATION) // set table name
public class UserRegistration implements TableColumnNameConstants {

	@Id	// define this as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto generate value
	@Column(name = ID)	// define column name
	private Integer id;

	@Column(name = FULL_NAME, nullable = false, columnDefinition = "VARCHAR(255)")
	private String fullName;

	@Column(name = USER_NAME, nullable = false, columnDefinition = "VARCHAR(50)", unique = true)
	private String userName;

	@Column(name = ADDRESS, nullable = false, columnDefinition = "VARCHAR(255)")
	private String address;

	@Column(name = CONTACT, nullable = false, columnDefinition = "VARCHAR(255)")
	private String contact;

	@Column(name = EMAIL, nullable = false, columnDefinition = "VARCHAR(255)")
	private String email;

	@Column(name = PASSWORD, nullable = false, columnDefinition = "VARCHAR(12)")
	private String password;

	@Column(name = DATE_OF_BIRTH, nullable = false, columnDefinition = "VARCHAR(50)")
	private String dateOfBirth;

	@Column(name = GENDER, nullable = false, columnDefinition = "VARCHAR(10)")
	private String gender;

	@Column(name = STATUS, nullable = false, columnDefinition = "boolean default true")
	@ColumnDefault("1")
	private boolean status;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = CREATED_IN, nullable = false, columnDefinition = "datetime")
	private Date created_in;

}