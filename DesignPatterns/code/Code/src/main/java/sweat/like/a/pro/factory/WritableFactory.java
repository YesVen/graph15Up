package sweat.like.a.pro.factory;

public class WritableFactory {

	public WritableFactory() {
		
	}
	
	public static Writable getWriter(String writeType) throws Exception{
		Writable writer;
		
		switch (writeType) {
		case "Pen":
			writer = new Pen();
			break;
		case "Marker":
			writer = new Marker();
			break;
		case "Pencil":
			writer = new Pencil();
			break;	
		default:
			throw new Exception("Cannot write with " + writeType +". Writable type not found. Please check writeType.");
		}
		
		return writer;
	}
}
