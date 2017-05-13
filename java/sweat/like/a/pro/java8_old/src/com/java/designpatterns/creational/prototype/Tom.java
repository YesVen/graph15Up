package sweat.like.a.pro.java8_old.src.com.java.designpatterns.creational.prototype;

public class Tom implements ProtoTypeFactory 
{
	@Override
	public Tom cloneMe()  
	{
		return new Tom();
	}
}
