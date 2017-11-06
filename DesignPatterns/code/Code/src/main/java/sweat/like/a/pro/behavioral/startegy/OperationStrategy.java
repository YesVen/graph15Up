package sweat.like.a.pro.behavioral.startegy;

/*
 * Collection.sort() user this design pattern.
 * It wants user to pass a strategy to perform operation.
 */

interface OperationStrategy {
	public void performOperation(int a, int b);
}


class AddOperation implements OperationStrategy{
	@Override
	public void performOperation(int a, int b) {
		int result  = a+b;
		System.out.println("Addtion is : "+ result);
	}
}

class SubtractOperation implements OperationStrategy{
	@Override
	public void performOperation(int a, int b) {
		int result  = a-b;
		System.out.println("Substraction is : "+ result);
	}
}

class MultiplicationOperation implements OperationStrategy{
	@Override
	public void performOperation(int a, int b) {
		int result  = a*b;
		System.out.println("Multiplication is : "+ result);
	}
}


