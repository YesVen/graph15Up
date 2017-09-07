package sweat.like.a.pro.builder.modern;


public class Main {
	public static void main(String[] args) throws Exception {
		
		TeaBuilder teaBuilder1 = new TeaBuilder();
		Tea tea1 = teaBuilder1.addMilk("1 cup").addTeapowder("1 spoon").build();
		
		TeaBuilder teaBuilder4 = new TeaBuilder();
		Tea tea4 = teaBuilder4.addTeapowder("2 spoon")
				.addAdrak("small pinch")
				.addMilk("2 cup")
				.addTeaMasala("1 packet")
				.addWater("1 glass")
				.build();
		
		TeaBuilder teaBuilder2 = new TeaBuilder();
		Tea tea2 = teaBuilder2.addTeapowder("2 spoon").addAdrak("small pinch").build();
		
		TeaBuilder teaBuilder3 = new TeaBuilder();
		Tea tea3 = teaBuilder3.build();
		
		
		
		
	}
}
