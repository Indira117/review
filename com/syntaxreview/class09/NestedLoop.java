package com.syntaxreview.class09;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {
			System.out.println("hi");
			for (int b = 0; b < 3; b++) {
				System.out.println("bye");
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			for (int b = 1; b < 3; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			// System.out.println(i);
			for (int b = 1; b < 3; b++) {
				System.out.println(i + "---" + b);
			}
			System.out.println();
		}

		for (int i = 1; i <= 9; i++) {
			// System.out.println(i);
			for (int b = 0; b <= 9; b++) {
				System.out.println(i + " " + b);
			}
			System.out.println();
		}
		// clock
		for (int i = 0; i < 24; i++) {
			// System.out.println(i);
			for (int b = 1; b < 60; b++) {
				if (i < 10) {
					if (b < 10) {
						System.out.println("0" + i + ":" + "0" + b);
					} else {
						System.out.println("0" + i + ":" + "0" + b);
					}
				} else {
					System.out.println(i + ":" + b);
				}
			}
			System.out.println();
		}

	}

}
