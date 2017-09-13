package sweat.like.a.pro.structural.adapter;

public class Main {
	
	public static void main(String[] args) {
		MarathiSpeaker marathiPerson = new MarathiSpeaker("Maze nav Dnyanesh ahe.", "Kas ahes tu");
		Translator translator = new Translator(marathiPerson);
		EnglishSpeaker eng1 = new EnglishSpeaker(translator);
		
		System.out.println(marathiPerson.name + "  "+ marathiPerson.message+ " translated to " +  eng1.name + "    "+ eng1.message);
	}
}
