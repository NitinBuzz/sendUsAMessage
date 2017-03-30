package com.nitin.MessageAPI;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jdk.nashorn.internal.runtime.Undefined;

@Path("Message")
public class MessagePOSTAPI {
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.TEXT_PLAIN)
		@Path("postMessage")
		public String getMes(String data){
			String regex = "-";
			String[] d1 = data.split(regex);
			String name = d1[0];
			String name1 = "";
			name = name.substring(1, name.length()).toUpperCase();
			if(name.contains("UNDEFINED")){
				name1 = "Avenger";
			}
			else{
				name1 = name;
			}
			System.out.println(data);
			return ("Thanks for the Message "+name1+", Love you...");
		}

	}