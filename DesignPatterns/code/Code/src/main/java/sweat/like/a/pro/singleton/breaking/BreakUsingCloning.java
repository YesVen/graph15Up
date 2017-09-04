package sweat.like.a.pro.singleton.breaking;


public class BreakUsingCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		SingleTon3 soleInstance1 = SingleTon3.getSoleInstance();
		System.out.println("hashcode : "+soleInstance1.hashCode());
		
		
		SingleTon3 clone = (SingleTon3) soleInstance1.clone();
		System.out.println("hashcode : "+clone.hashCode());
		
		System.out.println("Two diffrent hashcodes means two instances ");
		
	}
}


class SingleTon3 implements Cloneable
{
	
	private static SingleTon3 soleInstance;

	private SingleTon3() {
		
	}

	public static SingleTon3 getSoleInstance(){
		if(soleInstance == null){
			System.out.println("Creating soleInstance");
			System.out.println("****** This will be once in entire life of this app.******");
			soleInstance = new SingleTon3();
		}
		
		return soleInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}