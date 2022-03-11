package com.syntaxreview.class10;

public class ArrayWithChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char [] grade= {'A','B','C','D','E'};
char senValue=grade[1];
String [] names={"Mike","Nodir","Danilo","Bryan"};
String secondVal=names[1];

for (int i=0; i<grade.length;i++) {
	char valueFromArray=grade[i];
	System.out.println(valueFromArray);
}
	}

}
