package com.ssafy.type;

public class TimeTable {
	public static void main(String[] args) {
		for (int i = 2; i <11; i++) {
			for (int j = 1; j <9; j++) {
				System.out.format("%5s",(i-1)*(2+j-1) + " ");
			}
			System.out.print("\n");
		}
	}
}
