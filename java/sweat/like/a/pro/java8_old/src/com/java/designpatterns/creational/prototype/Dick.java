package sweat.like.a.pro.java8_old.src.com.java.designpatterns.creational.prototype;

public class Dick implements ProtoTypeFactory 
{
	@Override
	public Dick cloneMe()  
	{
		return new Dick();
	}
}
