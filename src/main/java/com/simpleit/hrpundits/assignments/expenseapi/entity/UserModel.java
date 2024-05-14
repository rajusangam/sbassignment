/**
 * 
 */
package com.simpleit.hrpundits.assignments.expenseapi.entity;

/**
 * 
 */
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserModel {
	
	@NotBlank(message = "Name should not be empty")
	private String name;

	@NotNull(message = "Email should not be empty")
	@Email(message = "Enter a valid email")
	private String email;
	
	@NotNull(message = "Password should not be empty")
	@Size(min = 5, message = "Password should be atleast 5 characters")
	private String password;
	
	private Long age = 0L;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the age
	 */
	public Long getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Long age) {
		this.age = age;
	}
}