package study.practice;

import java.util.Scanner;


public class practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
		System.out.print("국어점수 : ");
		int lang = scanner.nextInt();
		
		System.out.print("수학점수 : ");
		int math = scanner.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = scanner.nextInt();
		
		int total = lang + math +eng;
		double avg = total / 3.0 ;
		
		if (lang >= 40 && math >= 40 && eng >= 40 && avg >= 60) {
			
			System.out.println("국어 : "+ lang);
			System.out.println("수학 : "+ math);
			System.out.println("영어 : "+ eng);
			
			System.out.println("합계 : "+ total );
			System.out.printf("평균 : %.2f\n", avg );
			System.out.println("축하합니다. 합격입니다!");
			
			
			
			
		}else {
			System.out.println("불합격입니다.");
		}
		
	}

}
