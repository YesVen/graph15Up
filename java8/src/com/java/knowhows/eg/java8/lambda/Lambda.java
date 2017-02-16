package com.java.knowhows.eg.java8.lambda;

public class Lambda
{
	
	public static void main(String[] args) 
	{
		Hello hello = (String name)->
		{
			return "Hello "+ name;
		};
		
		System.out.println(hello.sayHello("dnyanesh"));
	}
	
}

interface Hello
{
	String sayHello(String name);
}
