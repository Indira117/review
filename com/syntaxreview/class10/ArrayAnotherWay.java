package com.syntaxreview.class10;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []names= {"Mike","Nodir","Danilo","Bryan"};
		
//		String[]name2;
//		name2= {"Sabin"};
		
		System.out.println(names[1]);
		
		int size=names.length;
		System.out.println("size of array "+size);
		System.out.println(names[names.length-2]);
		
		int i=2;
		System.out.println(names[i]);
		
		i+=1;
		System.out.println(names[i]);
		System.out.println("______________");
		for(int a=0;a<names.length;a++) {
			System.out.println(names[a]);
		}
		//OR <=
		for(int a=0;a<=names.length-1;a++) {
			System.out.println(names[a]);
		}
		
	}

}
