/**
 * 
 */
package com.simpleit.hrpundits.assignments.expenseapi.service;

/**
 * 
 */

import com.simpleit.hrpundits.assignments.expenseapi.entity.User;
import com.simpleit.hrpundits.assignments.expenseapi.entity.UserModel;

public interface UserService {
	
	User createUser(UserModel user);
	
	User readUser();
	
	User updateUser(UserModel user);
	
	void deleteUser();
	
	User getLoggedInUser();
}
