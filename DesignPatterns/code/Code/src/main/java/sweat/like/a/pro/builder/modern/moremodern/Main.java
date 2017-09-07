package sweat.like.a.pro.builder.modern.moremodern;

import sweat.like.a.pro.builder.modern.moremodern.Tea.TeaBuilder;

public class Main {
	public static void main(String[] args) throws Exception{
		Tea tea = new TeaBuilder().addMilk("asdasdasd").addTeapowder("asdasdsad").addAdrak("werwer").build();
	}
}
