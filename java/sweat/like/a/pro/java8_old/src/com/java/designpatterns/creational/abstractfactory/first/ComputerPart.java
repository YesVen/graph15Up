package sweat.like.a.pro.java8_old.src.com.java.designpatterns.creational.abstractfactory.first;

public class ComputerPart 
{
	String info;

	public ComputerPart(String info) {
		this.info = info;
	}
	
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	@Override
	public String toString()
	{
		return this.info;
	}
}
