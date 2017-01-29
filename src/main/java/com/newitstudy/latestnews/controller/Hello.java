package com.newitstudy.latestnews.controller;

import javax.ws.rs.*;

@Path("/")
public interface Hello {
	@GET
	@Path("say")
	public String sayHello();

}
