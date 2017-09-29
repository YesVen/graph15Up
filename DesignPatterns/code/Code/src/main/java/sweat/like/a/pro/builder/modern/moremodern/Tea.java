package sweat.like.a.pro.builder.modern.moremodern;

/*
 * Here we have moved Teabuilder from separate class to static inner class.
 * This is required since sometime we might add a new property to tea say sugar but developers miss to add it in 
 * builder.
 * This just create a better understanding for developers as tea and teabuilder resides in same file.
 */
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
	
	public static class TeaBuilder {
		private String water;
		private String milk;
		private String teapowder;
		private String teaMasala;
		private String adrak;
		public String getWater() {
			return water;
		}
		public String getMilk() {
			return milk;
		}
		public String getTeapowder() {
			return teapowder;
		}
		public String getTeaMasala() {
			return teaMasala;
		}
		public String getAdrak() {
			return adrak;
		}
		
		
		//define setters
		//Look closely they are not ordinary setters
		public TeaBuilder addMilk(String milk){
			this.milk = milk;
			return this;
		}
		
		public TeaBuilder addAdrak(String Adrak){
			this.adrak = Adrak;
			return this;
		}
		
		public TeaBuilder addTeapowder(String teapowder){
			this.teapowder = teapowder;
			return this;
		}
		public TeaBuilder addWater(String water){
			this.water = water;
			return this;
		}
		
		public TeaBuilder addTeaMasala(String teaMasala){
			this.teaMasala = teaMasala;
			return this;
		}
		
		
		 /* This is the heart of builder pattern.
		 * This method assigns current working instance to tea and create object.
		 */
		public Tea build() throws Exception{
			
			 /*
			  *  This is extra thing we are doing for making sure nobody should create a tea without milk and teapowder.
			  */
			 
			if(this.milk == null || this.teapowder == null ){
				throw new Exception("Cannot create tea without tepowder and milk. They must be required");
			}
			
			System.out.println("tea create with "+ this.water+", "+ this.milk +", "+
					this.teaMasala +  ", "+
					this.teapowder +  ", "+
					this.adrak);
			return new Tea(this);
		}
	}
}
