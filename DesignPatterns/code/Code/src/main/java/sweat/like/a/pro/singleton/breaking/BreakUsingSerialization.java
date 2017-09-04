package sweat.like.a.pro.singleton.breaking;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class BreakUsingSerialization  {

	public static void main(String[] args) throws Exception {
		
		SingleTon1 soleInstance1 = SingleTon1.getSoleInstance();
		System.out.println("hashcode : "+soleInstance1.hashCode());
		
		FileOutputStream fos = new FileOutputStream("/temp/obj.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(soleInstance1);
		
		oos.close();
		
		//Read object from file
		FileInputStream fis = new FileInputStream("/temp/obj.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		SingleTon1 soleinstance3 = (SingleTon1) ois.readObject();
		System.out.println("hashcode : "+soleinstance3.hashCode());
		
	}
}

class SingleTon1 implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private static SingleTon1 soleInstance;

	private SingleTon1() {
		
	}

	public static SingleTon1 getSoleInstance(){
		if(soleInstance == null){
			System.out.println("Creating soleInstance");
			System.out.println("****** This will be once in entire life of this app.******");
			soleInstance = new SingleTon1();
		}
		
		return soleInstance;
	}
}
