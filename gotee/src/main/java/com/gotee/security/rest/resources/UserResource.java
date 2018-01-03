package com.gotee.security.rest.resources;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.gotee.post.ExceptionMessage;
import com.gotee.post.Response;
import com.gotee.post.pojo.UserLoginCredential;
import com.gotee.security.entity.User;
import com.gotee.security.service.UserService;
import com.gotee.security.transfer.Farmer;
import com.gotee.security.transfer.UserTransfer;
import com.gotee.services.FarmerServices;


@Component
@Path("/user")
public class UserResource
{
	 private final Logger logger = LoggerFactory.getLogger(this.getClass());
	 
    @Autowired
    private UserService userService;
    
    @Autowired
    FarmerServices farmerServices;

    @Autowired
    @Qualifier("authenticationManager")
    private AuthenticationManager authManager;

    /**
     * Retrieves the currently logged in user.
     *
     * @return A transfer containing the username and the roles.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public UserTransfer getUser()
    {
    	this.logger.info("getUser()");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object principal = authentication.getPrincipal();
        System.out.println(">>"+principal);
        if (!(principal instanceof UserDetails)) {
            throw new WebApplicationException("UNAUTHENTICATION_USER");
        }
        UserDetails userDetails = (UserDetails) principal;
        System.out.println("???"+userDetails.getUsername());
        return new UserTransfer(userDetails.getUsername(), this.createRoleMap(userDetails));
    }

    
    @Path("authenticate")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public  Response authenticate(UserLoginCredential userLoginCredential) throws JsonGenerationException, JsonMappingException, IOException, ParseException
    {
    	this.logger.info("authenticate(): "+userLoginCredential);
    	
        UsernamePasswordAuthenticationToken authenticationToken =
                new UsernamePasswordAuthenticationToken(userLoginCredential.getUsername(), userLoginCredential.getPassword());
        Authentication authentication = this.authManager.authenticate(authenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        Object principal = authentication.getPrincipal();
        if (!(principal instanceof User)) {
            throw new WebApplicationException("UNAUTHENTICATION_USER");
        }

       // return this.userService.createAccessToken((User) principal);
        Object result=this.userService.createAccessToken((User) principal);
        Response res=new Response(ExceptionMessage.OK.getCode(),ExceptionMessage.OK.getDesc(), result);
        return res;
    }

   /* @Path("api/{username: [a-zA-Z][a-zA-Z_0-9]}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public  Response error() throws JsonGenerationException, JsonMappingException, IOException, ParseException
    {
  
        return new Response(ExceptionMessage.BAD_REQUEST.getCode(),ExceptionMessage.BAD_REQUEST.getDesc());
    }*/
    
    
    @Path("api/farmer/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public  Response getFarmer(@PathParam("id") String id) throws JsonGenerationException, JsonMappingException, IOException, ParseException
    {
    	//FarmersDetails farmersDetails= new FarmerDAOImpl().getFarmerDetail(id);
    	//FarmerServices farmerServices=new FarmerServices();
    	
    	Farmer farmer=farmerServices.getFarmer(id);
    	
    	
        return new Response(ExceptionMessage.OK.getCode(),ExceptionMessage.OK.getDesc(),farmer);
    }
    
    private Map<String, Boolean> createRoleMap(UserDetails userDetails)
    {
        Map<String, Boolean> roles = new HashMap<>();
        for (GrantedAuthority authority : userDetails.getAuthorities()) {
            roles.put(authority.getAuthority(), Boolean.TRUE);
        }

        return roles;
    }
}
