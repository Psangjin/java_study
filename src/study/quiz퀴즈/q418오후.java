package study.quiz퀴즈;

import java.util.Scanner;

public class q418오후 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("1. 정수를 입력하세요 : ");
		int num = scanner.nextInt()	;
		
		if ( num %2 == 1	) {
			System.out.println(" 홀수 odd 입니다.");			
		}else if (num %2 == 0) {
			System.out.println(" 짝수 even 입니다.");
		}else if (num < 0) {
			System.out.println(" 음수");
		}else {
			System.out.println("?");
		}
		System.out.println();
		
		
	//	2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.		
		
		System.out.print("2. <7의 배수 판독기>\n 정수를 입력하세요 : ");
		int num1 = scanner.nextInt()	;
	
		if ( num1 %7 == 0 )	 {
			System.out.println(" 7의 배수입니다.");
		}else {
			System.out.println(" 7의 배수가 아닙니다.");
		}
		System.out.println();
		
		
	//	3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		int num2 =0;
		for (int e=5; e<=1000; e=e+5) {
			num2 = num2 +e;
			
			
		}System.out.println("3. 1~1000까지의 수 중에서\n 5배수의 합은 : "+ num2);
		System.out.println();
		
	//	4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
		
		System.out.print("4. 1 ~ 50 까지의 수를 입력하세요 : ");
		int num3 = scanner.nextInt()	;
		
				
		if (num3 >= 1 && num3 <= 50) {
			for (int i =0; i< num3; i++) {				
				System.out.print( "*");	
			}
		}else {
			System.out.println(" 1~50 까지의 수를 입력하세요");
		}
		
	//	5. 1~10 까지의 수에서 홀수면 더하기(+),
	//	짝수면 빼기(-)를 수행해서 최종 결과 출력.
		
		System.out.print("5. 1 ~ 10 까지의 수를 입력하세요 : ");
		int num4 = scanner.nextInt()	;
		
	
		
		
		
	}

}
