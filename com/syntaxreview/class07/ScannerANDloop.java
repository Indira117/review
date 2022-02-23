package com.syntaxreview.class07;

import java.util.Scanner;

public class ScannerANDloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		int a=1;
		while(a<=5) {
		System.out.println("Please enter you name");
		String name=scan.next();
		System.out.println("Welcome "+name);
		a++;}
		
		System.out.println("----------");
		int b;
		do {System.out.println("enter number");
			 b=scan.nextInt();}while(b!=7); 
			System.out.println("winner");
		
			System.out.println("------");
			
			System.out.println("second lottery");
			
			int c=scan.nextInt();
			while(c!=7) { //if doesn't how many time needs action, FOR loop needs exactly time
				System.out.println("second lottery");
				c=scan.nextInt();
			}System.out.println("second winner");
			
	}

}
