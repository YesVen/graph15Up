package sweat.like.a.pro.structural.adapter;

public class EnglishSpeaker {

	String name;
	String message;
	
	
	public EnglishSpeaker(String name, String message) {
		this.name = name;
		this.message = message;
	}
	
	public EnglishSpeaker(Translator translator) {
		this.name = translator.name;
		this.message = translator.message;
	}

	public EnglishSpeaker() {
		super();
	}	
}
