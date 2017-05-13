package com.java.designpatterns.creational.abstractfactory.first;

public class ComputerCreator 
{
	public static void main(String[] args) 
	{
		ComputerCreator creator = new ComputerCreator();
		ComputerTypeFactory comptype = creator.getComputer("PC");
		
		//Here factory internally handles Which parts to be assembled for a PC or a Tab
	
		System.out.println(comptype);
		
		ComputerTypeFactory tab = creator.getComputer("Tab");
		
		//Here factory internally handles Which parts to be assembled for a PC or a Tab
	
		System.out.println(tab);
		
		
		
	}
	
	private ComputerTypeFactory getComputer(String type)
	{
		switch(type)
		{
			case "PC" : return new PC();
			case "Laptop" : return new Laptop();
			case "Tab" : return new Tab();
			default : return null;
		}
	}
}
