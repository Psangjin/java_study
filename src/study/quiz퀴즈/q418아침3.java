package study.quiz퀴즈;

import java.util.Scanner;

public class q418아침3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int read = scanner.nextInt();
		
		System.out.print("수학점수 : ");
		int math = scanner.nextInt();
		
		System.out.print("영어점수 : ");
		int engl = scanner.nextInt();
		
		int sum = math+read+engl;
		int ever = (math+ read+ engl)/3;
		if (read >= 40 && math >= 40 && engl >= 40) {
			if (ever >= 60) {
				System.out.println("국어 : "+read);
				System.out.println("수학 : "+math);
				System.out.println("영어 : "+engl);
				System.out.println("합계 : "+sum);
				System.out.println("평균 : "+(double)ever);
				System.out.println("축하합니다.합격입니다!");
		}	else {
				System.out.println("불합격입니다");
		}
		
		
	

		}
	}
}
