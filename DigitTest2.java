package com.ssafy.java;

public class DigitTest2 {

	public static void main(String[] args) {
		for (int i = 1; i <18; i++) {
			System.out.format("%4s", i);
			if (i == 5) {
				System.out.print("\n    ");
			}
			if (i == 8) {
				System.out.print("\n        ");
			}
			if (i == 9) {
				System.out.print("\n    ");
			}
			if (i == 12) {
				System.out.print("\n");
			}
		}

	}

}
