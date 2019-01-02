package com.ssafy.java;

import java.util.Random;
import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ������.\n1. 5�� 3��\n2. 3�� 2��\n3. 1�� 1��\n��ȣ�� �Է��ϼ���.");
		int number = sc.nextInt();
		int matchSize [] = {5, 3, 1};
		int matchNum = matchSize[number-1];
		String rockScissorPaper [] = {"����", "����", "��"};
		int playerCount = 0;
		int computerCount = 0;
		for(int i=0; i < matchNum;i++) {
			int matchFin = (int)((float)(matchNum/2)+1);
			while(true){
				int computerChoice = (int)(Math.random() * 3);
				String computerResult = rockScissorPaper[computerChoice];
//				System.out.println(matchFin);
				System.out.print("���������� �� �ϳ� �Է�.");
				Scanner sc2 = new Scanner(System.in);
				String playerResult = sc2.nextLine();
				if (computerResult.equals(playerResult)) {
					System.out.println("���º�!!!\n");
					continue;
				}
				if (computerResult.equals(rockScissorPaper[0])) {
					if (playerResult.equals(rockScissorPaper[2])) {
						System.out.println("�̰���ϴ�!!!\n");
						playerCount += 1;
						break;
					}
					else {
						System.out.println("�����ϴ�!!!\n");
						computerCount += 1;		
						break;
					}
				}
				if (computerResult.equals(rockScissorPaper[1])) {
					if (playerResult.equals(rockScissorPaper[0])) {
						System.out.println("�̰���ϴ�!!!\n");
						playerCount += 1;
						break;
					}
					else {
						System.out.println("�����ϴ�!!!\n");
						computerCount += 1;	
						break;
					}
				}
				if (computerResult.equals(rockScissorPaper[2])) {
					if (playerResult.equals(rockScissorPaper[1])) {
						System.out.println("�̰���ϴ�!!!\n");
						playerCount += 1;
						break;
					}
					else {
						System.out.println("�����ϴ�!!!\n");
						computerCount += 1;	
						break;
					}
				}			
			}
			if (playerCount >= matchFin) {
				System.out.println("### �÷��̾� ��!!!");
				break;
			}
			if (computerCount >= matchNum*2-1) {
				System.out.println("### ��ǻ�� ��!!!");
				break;
			}	
		}
	}

}
