package sweat.like.a.pro.behavioral.chainofresponsibility;

public interface Chain {
	public void process(Object o);
	public void setNext(Chain c);
}

class NegativeNumberProcessor implements Chain {
	Chain nextItem;
	
	@Override
	public void process(Object o) {
		if(o instanceof Integer && ((Integer)o).intValue() < 0)	{
			System.out.println("Processing Negative Number");
		}
		else{
			nextItem.process(o);
		}
	}

	@Override
	public void setNext(Chain c) {
		nextItem = c;	
	}
	
}

class NonNumberProcessor  implements Chain{
	Chain nextItem;
	
	@Override
	public void process(Object o) {
		System.out.println("Processing Non Number : "+ o);
	}

	@Override
	public void setNext(Chain c) {
		nextItem = c;
	}
}

class PositiveNumberProcessor  implements Chain{
	
	Chain nextItem;
	
	@Override
	public void process(Object o) {
		if(o instanceof Integer &&   ((Integer)o).intValue() > 0)	{
			System.out.println("Processing Positive Number");
		}
		else{
			nextItem.process(o);
		}
	}

	@Override
	public void setNext(Chain c) {
		nextItem = c;
	}
}
