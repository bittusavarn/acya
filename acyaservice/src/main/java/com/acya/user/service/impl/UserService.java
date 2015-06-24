package com.acya.user.service.impl;

import java.util.ArrayList;
import java.util.List;


import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;

import com.acya.beans.Error;
import com.acya.beans.ResponseCode;
import com.acya.beans.request.user.LoginRequest;
import com.acya.beans.response.user.LoginResponse;
import com.acya.constants.ErrorEnum;
import com.acya.constants.PreCacheCriteria;
import com.acya.pojo.Test;
import com.acya.user.service.IUserService;


public class UserService implements IUserService{

	
	
	public Response login(LoginRequest loginRequest) {
		LoginResponse loginResponse=new LoginResponse();
		ResponseCode responseCode=new ResponseCode();
		responseCode.setError(Boolean.TRUE);
		List<Error> errors=new ArrayList<Error>();
		Error error=new Error();
		error.setErrorCode(ErrorEnum.EXCEPTION.getErrorCode());
		error.setErrorDesc(ErrorEnum.EXCEPTION.getErrorDesc());
		errors.add(error);
		responseCode.setErrors(errors);
        loginResponse.setResponseCode(responseCode);
        PreCacheCriteria preCacheCriteria =new PreCacheCriteria();
        try {
			preCacheCriteria.afterPropertiesSet();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.ok(loginResponse).build();
	}

	public Response hello() {
		
		LoginResponse loginResponse=new LoginResponse();
		loginResponse.setDispName("Nilamber Kumar");
		return Response.ok(loginResponse).build();
	}

	

}
