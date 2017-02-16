package com.java.designpatterns.creational.abstractfactory.first;

public abstract class ComputerTypeFactory 
{
	//here i have added just simple methods which return string.
	//in real world these can return complex objects
	public abstract ComputerPart getRAM();
	public abstract ComputerPart getMOnitor();
	public abstract ComputerPart getKeyBoard();
}
