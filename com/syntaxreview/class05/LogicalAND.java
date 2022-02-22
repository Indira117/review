package com.syntaxreview.class05;

import java.util.Scanner;

public class LogicalAND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number");
		int number=scan.nextInt();
		if (number>0 && number<=10) {
			System.out.println("you entered smamll number");
		}else if (number>=10 && number<=100) {
			System.out.println("you entered medium number");
		}else if (number<100 && number>1000) {
			System.out.println("you entered large number");
		}
		
	}

}
