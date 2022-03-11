package com.syntaxreview.class08;

public class ODD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0,sum1=0;
		for (int i=1;i<=50;i++) {
			//System.out.print(i+" ");
			if (i%2!=0) {
				//System.out.print(i+" ");
				sum+=i;
			}
			else {
				//System.out.print(i+" ");
				sum1+=i;
			}
			
		}System.out.println("EVEN "+sum1);
		System.out.println("ODD "+sum);
	}

}
