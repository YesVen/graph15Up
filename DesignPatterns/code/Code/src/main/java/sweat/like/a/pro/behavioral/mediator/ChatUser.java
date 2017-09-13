package sweat.like.a.pro.behavioral.mediator;

public class ChatUser {

	String name;
	
	public ChatUser(String name) {
		this.name = name;
	}
	
	public void sendMessage(String msg){
		/*
		 * See here ChatUser delegating responsibility to send chat msg to Chatroom.
		 * Chatroom is a mediator which does maintain communication between Chatusers
		 */
		Chatroom.routeMessage(msg, this);
	}

}
