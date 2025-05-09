package study.quiz퀴즈;

import java.util.Scanner;

public class q425점심 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		야구 게임 (스크린 야구, 공격만)
//
//		스크린 야구 게임을 제작하려고 합니다.
//		해당 게임은 항상 공격만 하는 게임으로, 투수가 공을 던지는 것을 치기만 하면 됩니다.
//		투수의 공은 컴퓨터이며, 타자는 사용자 입니다.
//		(반복문, 조건문, 배열을 최대한 사용하시면 됩니다.)
//
//		- 기본 문제
//		투수가 매번 던지는 공은 1 ~ 10의 난수로 설정합니다.
//		사용자의 입력도 1 ~10까지 이며,
//		투수의 공과 사용자의 입력과 동일하면 안타로, 동일하지 않으면 아웃으로 간주합니다.
//		해당 게임은 3아웃이면 종료됩니다.
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("***********야구 게임************");
			System.out.printf("%-8s %5s %9s", "투수", "사용자입력", "타율");
			
			int taget;
			
			
			for (int i=0; i<=10; i++) {
				taget = (int)(Math.random()*10)+1;
				
				
////				
//				for(int j=0; j<i; j++) {
//					if(taget[i] == taget[j]) {
//					i--;
					break;
					}
//				}
				
			}
			
		}
		
	

}
