package com.java.knowhows.eg.java8;

public class Closures1 
{
	public static void main(String[] args) {
		int a =10;
		int b = 5;
		
		Closures1 obj = new Closures1();
		
		//Here we are using a and b for creating lambda expression.
		//the value of a will remain as it is and we cannot change its value.
		obj.doProcess(b, num -> a+b);
	}
	
	private void doProcess(int b, Process p)
	{
		System.out.println(p.process(b));
	}
}

@FunctionalInterface
interface Process
{
	public int process(int a);
}