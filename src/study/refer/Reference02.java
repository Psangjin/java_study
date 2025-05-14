package study.refer;

public class Reference02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 참조변수 : 배열
		
		// 배열이 없다면...
		int score1 = 100;
		int score2 = 85;
		int score3 = 75;
		int score4 = 65;
		int score5 = 40;
		
		int sum = 0;
		
		sum = score1 + score2+ score3+ score4+ score5;
		double avg  =sum /5.0;
		
		System.out.printf("총점:%d 평균: %.2f\n", sum,avg);
		
		
		// 배열 
		
		// int(정수형) 데이터를 가지는 배열 생성
		
		// Array 복수형
		// scoreArr scoreArray scores 여러변수를 가지고 있구나 느낌이 들게
		// 변수명을 정하는게 좋다
		
		int[] scoreArr = {100, 85, 75, 65, 40} ; //5개 정수를
		
		
		
		
		
	}

}
