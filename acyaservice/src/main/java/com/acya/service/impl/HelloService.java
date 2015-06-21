package com.acya.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.commons.logging.Log;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;



import com.acya.beans.ResponseCode;
import com.acya.beans.response.user.LoginResponse;
import com.acya.dao.TestDao;
import com.acya.dao.impl.TestDaoImpl;
import com.acya.pojo.BookVO;
import com.acya.pojo.Test;
import com.acya.pojo.TestRole;
import com.acya.user.pojo.User;


public class HelloService {
	
	Logger logger=LoggerFactory.getLogger(HelloService.class);
	@Autowired
	TestDao daoImpl;
	
	@GET
    @Path("/getbook/{name}")
    @Produces({"application/xml","application/json"})
    @Consumes({"application/xml","application/json","application/x-www-form-urlencoded"})
    public Response getBucket(@PathParam("name") String name) {
        
//        BookVO bookVO = null;
//       
//            bookVO =new BookVO();
//            bookVO.setBookName(name);
//            bookVO.setAuthor("Nilamber");
//            bookVO.setBookId(123);
//            
//             Test test=new Test();
//            test.setName("Nilamber");
//            test.setRole("2006ecs09");
//            
//            
//            
//            
//            daoImpl.saveTest(test);
//            logger.info("dhjfdkjf djfsdfkdfh sdfshd fksdhfksdfh ssfhdfkdh fss");
		
			LoginResponse loginResponse=new LoginResponse();
			
			return Response.ok(loginResponse).build();
          
        
    }
 
   

}
