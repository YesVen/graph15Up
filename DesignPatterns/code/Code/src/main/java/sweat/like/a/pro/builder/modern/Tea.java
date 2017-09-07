package sweat.like.a.pro.builder.modern;

public class Tea {
	
	String water;
	String milk;
	String teapowder;
	String teaMasala;
	String adrak;
	
	
	/*
	 * We should not allow to create tea class with 
	 * Tea tea = new Tea();
	 * as it breaks the concept behind builder pattern.
	 * We must force whoever using Tea class to build tea object using the tea builder only. 
	 */
	private Tea() {
		
	}
	
	public Tea(TeaBuilder builder){
		this.water = builder.getWater();
		this.adrak = builder.getAdrak();
		this.milk = builder.getMilk();
		this.teapowder = builder.getTeapowder();
		this.teaMasala = builder.getTeaMasala();
		
	}
}
