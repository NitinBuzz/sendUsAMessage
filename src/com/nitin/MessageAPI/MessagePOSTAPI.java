package com.nitin.MessageAPI;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("Message")
public class MessagePOSTAPI {
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.TEXT_PLAIN)
		@Path("postMessage")
		public String getMes(String data){
			
			System.out.println(data);
			return "Message was posted successfully";
		}

	}