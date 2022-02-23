package com.syntaxreview.class08;

import java.util.Scanner;

public class recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

int money;
int waterPrice=5;
System.out.println("enter money");
money=scan.nextInt();
while(money!=waterPrice) {
	if(money>waterPrice) {
		System.out.println("too much");
		//money=scan.nextInt();
	}else {System.out.println("insert more");
	//money=scan.nextInt();
	}money=scan.nextInt();
}System.out.println("enjoy your water");
	}

}
