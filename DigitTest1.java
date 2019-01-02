package com.ssafy.java;

public class DigitTest1 {

	public static void main(String[] args) {
		for (int i = 1; i <16; i++) {
			System.out.format("%4s", i);
			if (i == 5) {
				System.out.print("\n    ");
			}
			if (i == 9) {
				System.out.print("\n        ");
			}
			if (i == 12) {
				System.out.print("\n            ");
			}
			if (i == 14) {
				System.out.print("\n                ");
			}
		}

	}

}
