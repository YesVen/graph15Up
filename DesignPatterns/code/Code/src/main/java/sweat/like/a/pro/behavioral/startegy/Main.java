package sweat.like.a.pro.behavioral.startegy;

public class Main {
	public static void main(String[] args) {
		OperationStrategy add = new AddOperation();
		add.performOperation(10, 20);
		
		OperationStrategy sub = new SubtractOperation();
		sub.performOperation(10, 20);
		
		OperationStrategy mul = new MultiplicationOperation();
		mul.performOperation(10, 20);
	}
}
