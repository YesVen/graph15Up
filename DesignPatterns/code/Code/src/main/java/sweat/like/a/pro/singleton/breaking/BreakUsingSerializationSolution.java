package sweat.like.a.pro.singleton.breaking;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BreakUsingSerializationSolution  {

	public static void main(String[] args) throws Exception {
		
		Singleton9 soleInstance1 = Singleton9.getSoleInstance();
		System.out.println("hashcode : "+soleInstance1.hashCode());
		
		FileOutputStream fos = new FileOutputStream("/temp/obj.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(soleInstance1);
		
		oos.close();
		
		//Read object from file
		FileInputStream fis = new FileInputStream("/temp/obj.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Singleton9 soleinstance3 = (Singleton9) ois.readObject();
		System.out.println("hashcode : "+soleinstance3.hashCode());
		
	}
}

class Singleton9 implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private static Singleton9 soleInstance;

	private Singleton9() {
		
	}

	public static Singleton9 getSoleInstance(){
		if(soleInstance == null){
			System.out.println("Creating soleInstance");
			System.out.println("****** This will be once in entire life of this app.******");
			soleInstance = new Singleton9();
		}
		
		return soleInstance;
	}
	
	
	// implement readResolve method
    protected Object readResolve()
    {
        return soleInstance;
    }
	
}
