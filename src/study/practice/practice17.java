package study.practice;

import java.util.Scanner;

public class practice17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		prac1 ();
//		prac2 ();
//		prac3 ();
//		prac4 ();
//		prac5 ();
//		prac6 ();
		
		
		
		
		
	}
	public static void prac1() {
		
		// for (초기화; 조건; 증감	)
			//i=1; i<=10;	i++
			
//		1. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
											//	i			i
//		*****		5번		j=1; j<=5; j++		5	j<=i	1	j<=6-i	5
//		****		4번		j=1; j<=4; j++		4			2			4
//		***			3번		j=1; j<=3; j++		3			3			3
//		**			2번		j=1; j<=2; j++		2			4			2
//		*			1번		j=1; j<=1; j++		1			5			1
		
//		*****		5번		j=1; j<=5; j++		1	j=i
//		****		4번		j=2; j<=5; j++		2
//		***			3번		j=3; j<=5; j++		3
//		**			2번		j=4; j<=5; j++		4
//		*			1번		j=5; j<=5; j++		5
		
		//										i
//		*****		5번		j=5; j<=1; j--		1	j>=i	
//		****		4번		j=5; j<=2; j--		2
//		***			3번		j=5; j<=3; j--		3
//		**			2번		j=5; j<=4; j--		4
//		*			1번		j=5; j<=5; j--		5
		
		//행을 나타내는 값 : 5번 반복		(1~5) (11~15)	(101~105)
		//열을 나타내는 값 (출력되는 *의 갯수): 5 4 3 2 1
		
		//
		
		for (int i=1; i<=5; i++) {		//i: 1 2 3 4 5
			for (int j=i; j<=5; j++)
			System.out.print("*");
			System.out.println();
		}
		
		for (int i=5; i>=1; i--) {		//i: 1 2 3 4 5
			for (int j=1; j<=i; j++)
			System.out.print("*");
			System.out.println();
		}
		
		
	}
	
	public static void prac2() {
//		2. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
		//			i		j
//		*			1		1
//		**			2		2
//		***			3		3
//		****		4		4

		for (int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) { //j<=i
				System.out.print("*");
			}
			System.out.println();
		}
						
		}
	public static void prac3() {
//		3. 입력된 수의 약수를 출력하시오.
//		ex) 입력 : 6
//		1 2 3 6
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = scanner.nextInt()	;
		
		for(int i=1; i<=num; i++) {
			if (num%i == 0)
				System.out.print(i + " ");			
		}
		
		
		
	}
	public static void prac4() {
//		4. 중첩반복문을 활용하여 아래와 같이 결과가 나타나도록 출력코드를 작성해주세요.
//		숫자를 입력받고 아래 문양으로 * 출력하기
//		ex) 입력 : 5
//		*
//		**
//		***
//		****
//		*****
//		****
//		***
//		**
//		*
//
//		입력 : 3
//
//		*
//		**
//		***
//		**
//		*

		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = scanner.nextInt()	;
		
		for (int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) { //j<=i
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=num-1; i>=1; i--) {		
			for (int j=1; j<=i; j++)
			System.out.print("*");
			System.out.println();
		}
	}
	public static void prac5() {
//		5. 1+ (1+2)+ (1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) ..결과 계산 최종결과는?
		
		int sum=0;
		for (int i=1; i<=10; i++ ) { // i: 1~10 10줄
			for (int j=1; j<=i; j++) {
				sum = sum + j;
			}
		}
		System.out.println("총합:" + sum);
		
		
		sum =0;
		for (int i=1; i<=10; i++) {
	// i: 1~10
	// i*10 i*9 i*8...
	sum = sum + (i *  (11 - i ));
		}System.out.println("총합:" + sum);
		
}
	public static void prac6() {
//		6. 1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
//		100이상인지 찾으시오. 100 이상이된 시점의 누적합이 얼마인지 + 얼마까지 더해서 100이 넘었는지 찾으세요.
		
		int sum =0;
		int i=1;
//		while(sum <100) {
//			
//		}
//		
		while (true	) {
			
			//-198 +199
			if (i%2 == 0 ) { // 짝수
				sum = sum  - i;
			}else { // 홀수
				sum  = sum + i;
			}
			
			// i: 199
			
			if (sum >=100)
				break;
			
			i++ ;	//i : 200
		}
		System.out.println("100넘는 시점의 누적합 : " + sum);
		System.out.println("마지막에 연산된 값 : " + i);
		
	}





		
	}


