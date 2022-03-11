package com.syntaxreview.class08;

public class BreakANDcontenie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//break
		
		for (int i=1;i<4;i++) {
			System.out.println("hi");
			break;
		}
		for (int i=1;i<10;i++) {
			if(i==5) {
				System.out.println("it's 5");
				break;
			}
			System.out.println(i);
			
		}
		System.out.println("---------");
		//continue- skip 1 iteration
		
		for (int i=1;i<10;i++) {
			if(i==5 || i==7) {
				System.out.println("skip number");
				continue;
			}
			System.out.println(i);
			
		}
		
		
	}

}
