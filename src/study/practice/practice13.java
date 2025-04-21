package study.practice;

import java.util.Scanner;

public class practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//prac1 () ;
		//prac2 () ;
		//prac3 () ;
		//prac4 () ;
		//prac5 () ;
		//prac6 () ;
		prac7 () ;
	}
		
		
		
		
	
	public static void prac1() {	
		//1. 정수를 입력받고 홀수면 "odd"를 출력, 짝수면 "even"을 출력하기.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = scanner.nextInt()	;
		
		if( num % 2 == 0) { //짝수
			System.out.println("even");
		} else { //홀수
			System.out.println("odd");
		}
		
		//삼항연산자 케이스
		System.out.println( (num%2 ==0)? "even" : "odd");
		
//		case 0:
//		case 1:
//		default:
		
	}
	public static void prac2() {
		//2. 정수를 입력받고 7의 배수면 "7의 배수입니다" 출력, 아니면 "아닙니다" 출력하기.
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = scanner.nextInt()	;
		
		if( num % 7 == 0) { //7의 배수
			System.out.println("7의 배수입니다");
		} else { //아니다
			System.out.println("아닙니다");
		}
		
		//삼항연산자 케이스
				System.out.println( (num%2 ==0)? "7의 배수입니다" : "아닙니다");
		
	}
	public static void prac3() {
		//3. 1~1000 까지의 수 중에서 5의 배수의 합을 출력하기.
		// 5 10 15 20 25 30 .....
		// %5 == 0
		int sum = 0;
		for (int i=1; i <=1000; i++) {	// 1~1000
			if (1%5 == 0) { // 5의 배수다 !!
				//5의 배수를 누적 합 계산 +++++
				sum = sum + i;
			}
		}
		System.out.println("1~1000 까지 5의 배수의 합 : " + sum);
		sum = 0;
		for(int i=5; i<1000; i=i+5) {
			sum = sum +i ;
		}
	}
	public static void prac4() {
		//4. 1~50 까지의 수를 입력받아 해당 갯수만큼 *을 출력하기.
		//ex) 입력 : 10
	 	//결과 : **********
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~50 까지의 수를 입력 : ");
		int num = scanner.nextInt()	;
		
		//for (초기화; 조건식; 증감식 )
		//실행문
		
		for (int i=1; i<15; i++) {
			System.out.println("*");
		
		}
		
	}
	public static void prac5() {
		//5. 1~10 까지의 수에서 홀수면 더하기(+), 짝수면 빼기(-)를 수행해서 최종 결과 출력.
		//ex)  1 - 2 + 3 - 4 .....
		
		int sum = 0;
		for  (int i=1; i<=10; i++) {	//1~10
			
			if(i%2 == 0) {	// 짝수
				sum =sum - i;
			} else {	// 홀수
				sum =sum + i;
			}
					
		}System.out.println("계산 결과 : " +sum);
	}
	
	public static void prac6() {
		//6. 정수를 1부터 계속 누적으로 더한다. 이 더한 값이 1000 보다 작으면 계속 더하고
		//1000이 넘어가면 멈춘다. 멈추는 시점까지 누적으로 더해진 값을 출력하기.

		int i=1;
		int sum = 0;
		
		while (sum < 1000) {
			//더하기
			//sum = sum + i		// +1 +2 +3 ..
			// i ++; 	// i =i+1	i+ = 1
			sum = sum + i++;
		}
		
		System.out.println("1000이 넘는 누적 합 : "+ sum);
		
		i=1;
		sum = 0;
		while (true) {
			sum = sum + i;
			i++;
			
			if(sum >= 1000) {
				break;
			}
		}
		
		System.out.println("1000이 넘는 누적 합 : "+ sum);
		
	}
	public static void prac7() {
		//7. 입력 받은 수의 구구단 출력 (1~9까지 입력)
//		ex) 입력 3
//		3 * 1 = 3
//		3 * 2 = 6
//		3 * 3 = 9
//		...
//		3 * 9 = 27
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단 몇단? : ");
		int num = scanner.nextInt()	;
		
		if(num >= 1 && num <= 9) { //1~9 인 경우만 구구단 출력
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d =%d\n", num, i, num*i);
		}
	}
}

	