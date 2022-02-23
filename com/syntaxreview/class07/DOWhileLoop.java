package com.syntaxreview.class07;

public class DOWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		while(a<15) {//1st condition, after action
			System.out.println("hi");
			a++;
		}
		System.out.println("_______________");
		int b=10;
		do {System.out.println("hi");//1st action, after condition
		b++;}
		while (b<15);
		
	}

}
