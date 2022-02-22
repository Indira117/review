package com.syntaxreview.class04;

public class NestedIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	boolean allergy=true, petAllergy=false,
			peanutAllergy=false,pollenAllergy=false;
	if(allergy) {
		System.out.println("lets do further check");
		if(petAllergy) {System.out.println("no pets");}
		else if(peanutAllergy) {
			System.out.println("no peanuts");
		}else {System.out.println("all good");}
	}else {
		System.out.println("you are lucky");
	}

	}

}
