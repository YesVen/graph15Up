package sweat.like.a.pro.behavioral.mediator;

import java.util.Date;

public class Chatroom {
	public static void routeMessage(String msg, ChatUser user){
		System.out.println(new Date() + " - "+ user.name + " : "+ msg);
	}
}
