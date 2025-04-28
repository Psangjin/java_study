package study.refer;

import java.util.Scanner;

public class Reference07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String day1 = "MONDAY";
		String day2 = "FRIDAY";
		
				
		String today = "FRIDAY" ; // 사용자가 입력한 값이다?
		
		if (today.equals(day1)) {
			System.out.println("출근");
		}
		if (today.equals(day2)) {
			System.out.println("퇴근");
		}
		
		
		
		Week day3 = Week.MON;
		Week day4 = Week.WED;
		
		if(day4 == Week.FRI ) {
			System.out.println("금요일이구나~");
		}
		
		
	}

}
