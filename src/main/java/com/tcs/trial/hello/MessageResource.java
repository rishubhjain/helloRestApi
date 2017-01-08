package com.tcs.trial.hello;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

@Path("/messages")
public class MessageResource {
	
	MessageService msgService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessage() {
		return msgService.getAllMessage();
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long messageId){
		return msgService.getMessage(messageId);
		//return "Got Path Param " + messageId;
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message) {
		
		return msgService.addMessage(message);
	}
	/*
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public String addMessage(InputStream incomingData) {
		StringBuilder crunchifyBuilder = new StringBuilder();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
			String line = null;
			while ((line = in.readLine()) != null) {
				crunchifyBuilder.append(line);
			}
		} catch (Exception e) {
			System.out.println("Error Parsing: - ");
		}
		System.out.println("Data Received: " + crunchifyBuilder.toString());
		return crunchifyBuilder.toString();
		
	}*/
}
