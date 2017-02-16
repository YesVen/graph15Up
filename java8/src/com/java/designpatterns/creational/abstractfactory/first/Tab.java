package com.java.designpatterns.creational.abstractfactory.first;

public class Tab extends ComputerTypeFactory
{

	@Override
	public ComputerPart getRAM() {
		return new ComputerPart("2 GB");
	}

	@Override
	public ComputerPart getMOnitor() {
		return new ComputerPart("17 inch");
	}

	@Override
	public ComputerPart getKeyBoard() {
		return new ComputerPart("Smooth Touch");
	}
	
	@Override
	public String toString()
	{
		return getRAM().toString() + getMOnitor()+ getKeyBoard();
	}
}
