package com.tcs.trial.hello;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageService {
	

	private Map<Long,Message> messages = DatabaseClass.getMessage();
	public MessageService() {
		super();
		messages.put(1L,new Message(1,"TCS","Hello world"));
		messages.put(2L, new Message(2,"TCS","Welcome") );
	}

	public List<Message> getAllMessage() {
	/*	Message m1 = new Message(1,"TCS","Hello world");
		Message m2 = new Message(2,"TCS","Welcome");
		List<Message> list = new ArrayList();
		list.add(m1);
		list.add(m2);
		return list; */
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(),message);
		return message;
		
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
		
	}

	
}
