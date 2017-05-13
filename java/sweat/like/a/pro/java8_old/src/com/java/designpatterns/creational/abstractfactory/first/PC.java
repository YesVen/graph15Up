package sweat.like.a.pro.java8_old.src.com.java.designpatterns.creational.abstractfactory.first;

public class PC extends ComputerTypeFactory
{

	@Override
	public ComputerPart getRAM() {
		return new ComputerPart("4 GB");
	}

	@Override
	public ComputerPart getMOnitor() {
		return new ComputerPart("15 inch");
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
