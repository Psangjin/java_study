package study.practice;

import java.util.Scanner;

public class practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("출생년도를 입력하세요: ");
		int year = scanner.nextInt();
		
		
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		int number = scanner.nextInt();
		
		// 2000년생 26살
		// 2025 -2000 = 25 + 1 = 26
		// 나이계산 기준년도(2025) - 입력한년도(2000) + 1 => 나이
		//			2026 - 입력한 년도	=>
		
		//int age = 2026 - year; // 2025년도 기준 나이계산
		int age = 2025 - year + 1; // 2025년도기준 한국나이계산 (+1)
		
		// 년도 + 뒷자리가 잘못된 케이스는 구별하지 못하는 상태
		/*
		if (number == 1) {
			System.out.println(age + "살 남자입니다.");
		}else if (number == 2) {
			System.out.println(age + "살 여자입니다");
		}else if (number == 3) {
			System.out.println(age + "살 남자입니다");
		}else if (number == 4) {
			System.out.println(age + "살 여자입니다");
		}else {
			System.out.println("잘못된 입력");
		}
		*/
		
		if (number == 1 && year < 2000) {
			System.out.println("결과 : "+age + "살 남자입니다.");
		}else if (number == 2 && year < 2000) {
			System.out.println("결과 : "+age + "살 여자입니다");
		}else if (number == 3 && year >= 2000) {
			System.out.println("결과 : "+age + "살 남자입니다");
		}else if (number == 4 && year >= 2000) {
			System.out.println("결과 : "+age + "살 여자입니다");
		}else {
			System.out.println("잘못된 입력");
		}
		
		
		if( (number == 1 && year < 2000) || (number == 2 && year < 2000)
		|| (number == 3 && year >= 2000) || (number == 4 && year >= 2000) ){
			
		} else {
			System.out.println("잘못된 입력");
		}
		
		
		if ( ( (number == 1 || number == 2) && year < 2000)
				||
		     ( (number == 3 || number == 4) && year >= 2000) )  {
			
			if (number == 1 || number == 3) {
				System.out.println(age + "살 남자");
			}
			if (number == 2 || number == 4) {
				System.out.println(age + "살 여자");
			}
			
			
		} else {
			System.out.println("잘못된 입력");
		}
		
		//결과출력
		
		
	}

}
