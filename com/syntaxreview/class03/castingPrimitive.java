package com.syntaxreview.class03;

public class castingPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d=12/7;
System.out.println(d);

double e=4;//widening
System.out.println(e);

//int i=9.99; error casting

//casting in Java---converting 1 type to another
//widening-implicit(automatic) byte>short>integer>long>float>double
//narrowing- explicit (manual) double>float>long>int>short>byte

int i=(int)9.99;// narrowing
System.out.println(i);

byte b=(byte)130;
System.out.println(b);


	}

}
