package sweat.like.a.pro.factory;

public class Notebook {

	Writable writer;
	
	public void doHomeWork(String writeType) throws Exception 
	{
		writer = WritableFactory.getWriter(writeType);
		
		writer.write();
	}

	
}
