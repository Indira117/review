package com.syntaxreview.class11;

public class PrintingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] colors= {"red","blue","yellow"};
		for (int i=0;i<colors.length;i++) {
			System.out.println(colors[i]);
		}
		System.out.println("______");
		
		for(String color:colors) {
			System.out.println(color);
		}
		
	}

}
