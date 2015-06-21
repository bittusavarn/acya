package com.acya.user.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.acya.beans.request.user.LoginRequest;
/**
 * 
 * @author Nilamber Kumar
 *
 */
public interface IUserService {

	
	
	/**
	 * Check Creditial and Return User
	 * @param loginRequest
	 * @return
	 */
	
	@POST
    @Path("/login")
    @Produces({"application/xml","application/json"})
    @Consumes({"application/xml","application/json","application/x-www-form-urlencoded"})
    Response login(LoginRequest loginRequest);
	
	/**
	 * Check Creditial and Return User
	 * @param loginRequest
	 * @return
	 */
	
	@GET
    @Path("/hello")
    @Produces({"application/xml","application/json"})
    @Consumes({"application/xml","application/json","application/x-www-form-urlencoded"})
    Response hello();
	
	
}
