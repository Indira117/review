package com.syntaxreview.class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=80;
		String str="hdsgfjhg";
		Scanner scan=new Scanner(System.in);
		
		
		boolean rain=scan.nextBoolean();
		if(rain) {
			System.out.println("please take an umbrella");
		}else {System.out.println("It's nice weather");}
		
		String value=scan.next();//nextLine
		
		System.out.println("Hello "+ value);
		System.out.println(value.charAt(0));
	
	if (value.equalsIgnoreCase("indira")) {
		System.out.println("correct");
	}else {
		System.out.println("Not correct");
	}}

}
