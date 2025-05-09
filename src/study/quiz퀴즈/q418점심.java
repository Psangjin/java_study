package study.quiz퀴즈;

import java.util.Scanner;

public class q418점심 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.print("년도를 입력하세요 : ");
		int year = scanner.nextInt();
		
		int sum4 = year % 4;
		int sum100 = year % 100;
		int sum400 = year % 400;
		
		if (sum4 == 0 ) {
			System.out.println("윤년입니다.");
		}else if (sum400 == 0 ) {
				System.out.println("윤년입니다.");
		}else if	(sum100 == 0 ) {
					System.out.println("윤년이 아닙입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}
			 
	}
}


		
		
		
	
		
		
