package study.practice;

import java.util.Scanner;

public class practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 		%4		%100	%400	윤년
//		2020	O		 X		  X		 O
//		2100	O		 O		  X		 X
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		int year = scanner.nextInt();
		
		if( year % 4 == 0) {
			
			if(year % 100 == 0) {
				
				if(year % 400 == 0) {
					System.out.println("윤년입니다.");
				}else {
				System.out.println("윤년입니다.");
				}
			}else {
				System.out.println("윤년입니다.");
			}
			
		}else {
			System.out.println("윤년이 아닙니다");
		}
		
		
		if (year %400 ==0 ) {
			System.out.println("윤년O");
		}else if (year %100 ==0) {
			System.out.println("윤년X");
		}else if ( year %1 ==0) {
			System.out.println("윤년O");
		}else {
			System.out.println("윤년X");
		}
		
		if( year%400==0	|| (year%4 == 0 && ! (year %100 ==0))) {
			System.out.println("윤년O");
		}else {
			System.out.println("윤년X");
		}
	}

}
