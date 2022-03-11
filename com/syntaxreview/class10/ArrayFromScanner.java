package com.syntaxreview.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String[]names;
int size;
System.out.println("How many names would you like to store");
size=scan.nextInt();
names=new String [size];
for(int i=0;i<size;i++) {
	System.out.println("please enter any name");
	names[i]=scan.next();
	}
for (int i=0;i<names.length;i++) {
	System.out.print(names[i]+" ");
}
	}

}
