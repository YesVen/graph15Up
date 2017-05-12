package com.java.designpatterns.creational.prototype;

public class Tom implements ProtoTypeFactory 
{
	@Override
	public Tom cloneMe()  
	{
		return new Tom();
	}
}
