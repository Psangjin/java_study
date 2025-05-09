package study.quiz퀴즈;

import java.util.Scanner;

public class q425아침 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		학생 10명의 시험 점수가 다음과 같이 주어졌다고 가정합니다.
		이 점수들을 배열에 저장한 뒤, 다음 조건에 따라 통계를 계산하는 프로그램을 작성하세요.

		int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};

		최고 점수와 최저 점수를 력하세요.
		평균 점수를 출력하세요.
		80점 이상인 학생의 수를 출력하세요.

		출력 예)

		최고 점수: 100
		최저 점수: 63
		평균 점수: 82.5
		80점 이상 학생 수: 6명
		*/
		
		
		Scanner scanner = new Scanner(System.in);
		
		int[] scores = {88, 92, 75, 63, 95, 70, 85, 90, 100, 67};
		
	
		
		
		int max = scores[0];
		int min = scores[0];
		int sum = 0;
		int count = 0;
		
		
		for(int i=0; i<scores.length; i++) {
			if(scores[i] > max) {
				max =scores[i];
			}	//지금까지의 최대값인 max보다 배열에 있는 값이 더 크다
				//더 큰 값 찾음
			if(scores[i] > min) {
				min =scores[i];
			}
			
			sum = sum + scores[i];
			
			if(scores[i] >= 80) {
				count += 1;
		}
			
		}
		double avg= (double) sum/scores.length;        
		
		System.out.printf("최고 점수 : %d\n", max );
		System.out.printf("최저 점수 : %d\n", min );
		System.out.printf("평균 점수 : %.2f\n", avg );
		System.out.printf("80점 이상 학생 수 : %d명 \n", count );
		}
}
//
//		for(int i=0; i<scores.length; i++) {
//			if(scores[i] > max) {
//				max =scores[i];
//			}	//지금까지의 최대값인 max보다 배열에 있는 값이 더 크다
//				//더 큰 값 찾음
//		}
//		
//		int min = scores[0];		//최저 값
//		for(int i=0; i<scores.length; i++) {
//			if(scores[i] > min) {
//				min = scores[i];
//			}
//		}
//		int sum=0 ;		// 평균
//		for(int i=0; i<scores.length; i++) {
//			sum =sum + scores[i];
//		}
//		double avg= (double) sum/scores.length;
//		
//		int count= 0;
//		for(int i=0; i<scores.length; i++) {
//			if(scores[i] >= 80)	{
//				count += 1;
//			}
//		}
//		
//		
//		
		
	


