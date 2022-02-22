package com.syntaxreview.class06;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter a day number");
int day=scan.nextInt();
String today;
switch (day) {

case 1:today="Monday";
break;
case 2:today="Tuesday";
break;
case 3:today="Wednesday";
break;
case 4:today="Thursday";
break;
case 5:today="Friday";
//break;
case 6:today="Saturday";
break;
case 7:today="Sunday";
break;

default:today="Invalid day";
break;


}
System.out.println(today);


	}

}
