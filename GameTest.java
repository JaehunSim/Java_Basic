package com.ssafy.java;

import java.util.Random;
import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위바위보를 시작합니다. 아래 보기 중 하나를 고르세요.\n1. 5판 3승\n2. 3판 2승\n3. 1판 1승\n번호를 입력하세요.");
		int number = sc.nextInt();
		int matchSize [] = {5, 3, 1};
		int matchNum = matchSize[number-1];
		String rockScissorPaper [] = {"바위", "가위", "보"};
		int playerCount = 0;
		int computerCount = 0;
		for(int i=0; i < matchNum;i++) {
			int matchFin = (int)((float)(matchNum/2)+1);
			while(true){
				int computerChoice = (int)(Math.random() * 3);
				String computerResult = rockScissorPaper[computerChoice];
//				System.out.println(matchFin);
				System.out.print("가위바위보 중 하나 입력.");
				Scanner sc2 = new Scanner(System.in);
				String playerResult = sc2.nextLine();
				if (computerResult.equals(playerResult)) {
					System.out.println("무승부!!!\n");
					continue;
				}
				if (computerResult.equals(rockScissorPaper[0])) {
					if (playerResult.equals(rockScissorPaper[2])) {
						System.out.println("이겼습니다!!!\n");
						playerCount += 1;
						break;
					}
					else {
						System.out.println("졌습니다!!!\n");
						computerCount += 1;		
						break;
					}
				}
				if (computerResult.equals(rockScissorPaper[1])) {
					if (playerResult.equals(rockScissorPaper[0])) {
						System.out.println("이겼습니다!!!\n");
						playerCount += 1;
						break;
					}
					else {
						System.out.println("졌습니다!!!\n");
						computerCount += 1;	
						break;
					}
				}
				if (computerResult.equals(rockScissorPaper[2])) {
					if (playerResult.equals(rockScissorPaper[1])) {
						System.out.println("이겼습니다!!!\n");
						playerCount += 1;
						break;
					}
					else {
						System.out.println("졌습니다!!!\n");
						computerCount += 1;	
						break;
					}
				}			
			}
			if (playerCount >= matchFin) {
				System.out.println("### 플레이어 승!!!");
				break;
			}
			if (computerCount >= matchNum*2-1) {
				System.out.println("### 컴퓨터 승!!!");
				break;
			}	
		}
	}

}
