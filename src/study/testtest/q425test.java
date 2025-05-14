package study.testtest;

import java.util.Random;
import java.util.Scanner;

public class q425test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		basic();
//		level1();
//		level2();
//		level();
		
	}
		public static void basic() {
			
			//공격만 입력 / 동일하면 안타로 / 동일하지 않으면 아웃 / 3아웃이면 좋료
			Scanner scanner = new Scanner(System.in);
			System.out.print("공의 번호를 입력하세요 : ");
			int batting = scanner.nextInt();
			
			while(true) {
				
				System.out.println("***********야구 게임************");
				
				
				
				
				
			
			//공격만 입력 / 동일하면 안타로 / 동일하지 않으면 아웃 / 3아웃이면 좋료
			System.out.printf("%-8s  %5s  %9s", "투수", "사용자입력", "타율");
			System.out.println();
			System.out.printf("%-8s  %5s  %9s", "save", "batting", "타율" );
			
			//투수 save
			//사용자 batting
			//타율 cut
			
			//랜덤 값 save
			int[] save = new int[batting];	
			
			int num; 
			int index = 0; 
			
										//투수 = 	사용자 = 안타
												//투수 != 사용자 = 아웃
												//3아웃 종료
			
			for(int i=0; i<batting; i++) {
				
				save[i] = (int)(Math.random() * 10) + 1 ;
				
				for(int j=0; j<i; j++) {
					if(save[i] == save[j]) {
						
								
						break;
						
					}
				}
			}
			
			//  출력
			for(int i=0; i<batting; i++) {
				System.out.print(save[i] + " ");
			}
			
			}
			// 죄송합니다 열공하겠습니다
			
		}
		
		public static void level1() {
			
		
			
		}
		
		public static void level2() {
	
		}

		public static void level3() {
	
		}

}
