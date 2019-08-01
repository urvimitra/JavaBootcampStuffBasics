package com.shell.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("welcome")
public class Welcome {
	
	@GET
	@Produces("text/plain")
public String welcomeMe(){
	return "Welcome to Jersey World";
}
	
	@GET
	@Produces("text/xml")
public String welcomeMeXML(){
		String msg="<?xml version='1.0'?>"+"<welcome>Hi</welcome>";
	return msg;
}
	

	@GET
	@Produces("text/html")
	public String welcomeMeHTML(@PathParam("username") String username)
	{
		String msg="<html><body>"+"<h1>"+username+" welcome</h1>"+"</body></html>";
		return msg;
	}
}

