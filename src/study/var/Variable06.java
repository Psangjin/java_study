package study.var;

import java.util.Scanner;	//	Scanner 라이브러리		import (불러온다/가져온다)


public class Variable06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 사용자 입력
		
		Scanner scanner =  new Scanner (System.in);		// Scanner 생성
			
		System.out.println("입력");
		
		String inputData = scanner.nextLine();		// 다음 엔터까지 입력된 값 읽어오기
		
		System.out.println("입력완료");
		System.out.println(inputData);
		
		System.out.println("지금 몇시죠? : ");
		int hour = scanner.nextInt();
		
		System.out.printf("아~ 지금 %d시 이군요!\n", hour);
		
		System.out.println("중간고사 평균 점수 입력 : ");
		double mean = scanner.nextDouble();
		System.out.printf("아 %.2f점 이군요~\n", mean);
		
		
	}

}
