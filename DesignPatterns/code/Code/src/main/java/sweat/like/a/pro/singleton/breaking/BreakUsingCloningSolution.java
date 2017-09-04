package sweat.like.a.pro.singleton.breaking;


public class BreakUsingCloningSolution {
	public static void main(String[] args) throws CloneNotSupportedException {
		SingleTon5 soleInstance1 = SingleTon5.getSoleInstance();
		System.out.println("hashcode : "+soleInstance1.hashCode());
		
		
		SingleTon5 clone = (SingleTon5) soleInstance1.clone();
		System.out.println("hashcode : "+clone.hashCode());
		
		System.out.println("Two diffrent hashcodes means two instances ");
		
	}
}


class SingleTon5 implements Cloneable
{
	
	private static SingleTon5 soleInstance;

	private SingleTon5() {
		
	}

	public static SingleTon5 getSoleInstance(){
		if(soleInstance == null){
			System.out.println("Creating soleInstance");
			System.out.println("****** This will be once in entire life of this app.******");
			soleInstance = new SingleTon5();
		}
		
		return soleInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("********* You cannot create clone of Singleton********");
	}
}