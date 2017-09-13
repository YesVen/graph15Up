package sweat.like.a.pro.structural.adapter;

/**
 * This is an adapter which makes English person able to understand what Marathi guy has to say.
 * Marathi to English
 * 
 * Other examples : FileInputStream fos = new FileinputStream(new InputStream()):
 *
 * Definition : “Convert the interface of a class into another interface clients expect.
 *  Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.”
 *
 */
public class Translator extends MarathiSpeaker {

	
	public Translator(MarathiSpeaker marathiPerson) {
		adapt(marathiPerson);
	}
	
	private void adapt(MarathiSpeaker person){
		
		this.name  = "My name is Dnyanesh";// translated from person.name 
		this.message = "How are you?"; // translated from person.message
	}
}
