package com.syntaxreview.class08;

import java.util.Scanner;

public class multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter number");
int num= scan.nextInt();

int result;
for (int i=1;i<=10;i++) {
	result=num*i;
	System.out.println(num+" * "+i+" = "+result);
}
	}

}
