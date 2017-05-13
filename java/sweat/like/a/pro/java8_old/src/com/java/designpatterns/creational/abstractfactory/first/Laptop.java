package sweat.like.a.pro.java8_old.src.com.java.designpatterns.creational.abstractfactory.first;

public class Laptop extends ComputerTypeFactory
{

	@Override
	public ComputerPart getRAM() {
		return new ComputerPart("8GB");
	}

	@Override
	public ComputerPart getMOnitor() {
		return new ComputerPart("17 inch");
	}

	@Override
	public ComputerPart getKeyBoard() {
		return new ComputerPart("Standard");
	}
	
	@Override
	public String toString()
	{
		return getRAM().toString() + getMOnitor()+ getKeyBoard();
	}
	
}
