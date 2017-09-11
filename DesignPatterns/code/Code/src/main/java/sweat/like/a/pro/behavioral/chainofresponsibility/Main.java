package sweat.like.a.pro.behavioral.chainofresponsibility;

public class Main {
	public static void main(String[] args) {
		Chain c1 = new NonNumberProcessor();
		
		Chain c2 = new PositiveNumberProcessor();
		Chain c3 = new NegativeNumberProcessor();
		
		c3.setNext(c2);
		c2.setNext(c1);
		
		c3.process(-50);
		c3.process(+50);
		c3.process("Test String");
		
	}
}
