package com.syntaxreview.class08;

import java.util.Scanner;

public class recapDOwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		int money;
		int waterPrice=5;
		System.out.println("enter money");
		
		do {money=scan.nextInt();
			if(money>waterPrice) {
			System.out.println("too much");
			//money=scan.nextInt();
		}else if(money<waterPrice){System.out.println("insert more");
		//money=scan.nextInt();
		}//money=scan.nextInt();
		}while(money!=waterPrice);
		System.out.println("enjoy your water");
	}

}
