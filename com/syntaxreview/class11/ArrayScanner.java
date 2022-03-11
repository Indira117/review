package com.syntaxreview.class11;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
double [] arrayD;
double sum=0;
int size;

System.out.println("Size Array");
size =scan.nextInt();
arrayD=new double[size];
//store values
for(int i=0;i<size;i++) {
	System.out.println("enter numbers");
	arrayD[i]=scan.nextDouble();
	}
//sum
for (int i=0;i<arrayD.length;i++) {
	sum=sum+arrayD[i];
}System.out.println(sum);



	}

}
