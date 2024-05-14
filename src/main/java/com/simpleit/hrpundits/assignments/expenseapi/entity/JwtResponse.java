/**
 * 
 */
package com.simpleit.hrpundits.assignments.expenseapi.entity;



public class JwtResponse {
	


	private String jwtToken;
	
	public JwtResponse(String jwtToken) {
	this.jwtToken = jwtToken;
	}
	/**
	 * @return the jwtToken
	 */
	public String getJwtToken() {
		return jwtToken;
	}
	/**
	 * @param jwtToken the jwtToken to set
	 */
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	
	

}
