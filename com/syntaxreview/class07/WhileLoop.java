package com.syntaxreview.class07;

public class WhileLoop {
public static void main(String[]args) {
	
	int time=5;
	while(time<7) {
		System.out.println("good day");
		time++;
	}
	
	int a=10;//print even number
	while(a<31) {
		if (a%2==0) {
			System.out.print(a+" ");
		
		}a++;
		
	}
	System.out.println();
	int f=100;//print odd number
	while(f>=1) {
		if (f%2!=0) {
			System.out.print(f+" ");
		
		}f--;
		
	}
	System.out.println(" ");
	boolean today=true;
	while(today) {
		System.out.println("welcome");
		today=false;
	}
	
	
}


}
