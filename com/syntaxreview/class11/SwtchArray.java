package com.syntaxreview.class11;

public class SwtchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String capital = null;
		String []countries= {"Kazakhstan", "US", "Uzbekistan"};
		for (String country:countries) {
			switch(country) {
			case "Kazakhstan": capital="Astana";
			break;
			case "USA": capital="DC";
			break;
			case "Uzbekistan": capital="Tashkent";
			break;
			default:capital="XXX";
			}
			System.out.println(country+"  "+capital);
		}

	}

}
