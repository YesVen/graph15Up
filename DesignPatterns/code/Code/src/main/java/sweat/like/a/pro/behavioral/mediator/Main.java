package sweat.like.a.pro.behavioral.mediator;

public class Main {
	public static void main(String[] args) {
	
		/*
		 * Its very beautiful design pattern
		 * 
		 * See below it looks like Dnyanesh and Niky are chatting together independantly
		 * but the conversation is cleverly maintained by Chatroom.
		 */
		
		ChatUser dnyanesh = new ChatUser("Dnyanesh");
		
		ChatUser niky = new ChatUser("Niky");
		
		dnyanesh.sendMessage("Hey there");
		niky.sendMessage("Hi Dnyanesh, how are you?");
	}
}
