package com.syntaxreview.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]=new int[5];
		array[0]=98;
		array[1]=88;
		array[2]=48;
		array[3]=89;
		array[4]=95;
		int average= (array[0]+array[1]+array[2]+array[3]+array[4])/5;
		System.out.println("result "+average);
		
		String[]liquid=new String[3];
		liquid[1]="Water";
		liquid[2]="Tea";
		
		System.out.println(liquid[0]);
	}

}
