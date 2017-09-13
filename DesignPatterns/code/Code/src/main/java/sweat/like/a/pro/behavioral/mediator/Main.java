package sweat.like.a.pro.behavioral.mediator;

public class Main {
	public static void main(String[] args) {
	
		ChatUser dnyanesh = new ChatUser("Dnyanesh");
		
		ChatUser niky = new ChatUser("Niky");
		
		dnyanesh.sendMessage("Hey there");
		niky.sendMessage("Hi Dnyanesh, how are you?");
	}
}
