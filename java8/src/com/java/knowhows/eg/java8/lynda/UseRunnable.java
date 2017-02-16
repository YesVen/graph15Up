package com.java.knowhows.eg.java8.lynda;

public class UseRunnable {

	public static void main(String[] args) {

		Runnable run1 = () ->{
			System.out.println("Get set go!!");
		};
		
		Runnable run2 = () ->{
			System.out.println("Already there :)");
		};
		
		new Thread(run1).start();
		new Thread(run2).start();
	}

}
