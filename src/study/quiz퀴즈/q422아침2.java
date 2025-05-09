package study.quiz퀴즈;

import java.util.Scanner;

public class q422아침2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//prac1();
		//prac2();
		//prac3();
		//prac4();
		//prac5();
		prac6();
		
	}
		
		public static void prac1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 종료");
		
		//고수의 코드
		String[] numArr = {"입력", "수정", "조회", "삭제", "종료"};
		
		for(int i=0; i<numArr.length; i++) {// i: 0 1 2 3 4
			System.out.println((i+1)+ " . "+ numArr[i]);
			// i:0				0+1.			numArr[0]
			//					1. 입력
		}
		
		
		
		Scanner scanner = new Scanner (System.in);

		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = scanner.nextInt();
		
		if (num >=1 && num <= 4 ) {
			System.out.println(numArr[num-1]+ "메뉴입니다.");
		} else if (num == 5) {
			System.out.println("프로그램이 종료됩니다.");
			
		} else	{
			System.out.println("잘못입력하셨습니다.");
		}
		
		/*
		
		if(num == 1) {
			System.out.println("입력 메뉴입니다.");
		}else if(num == 2) {
			System.out.println("수정 메뉴입니다.");
		}else if(num == 3) {
			System.out.println("조회 메뉴입니다.");
		}else if(num == 4) {
			System.out.println("삭제 메뉴입니다.");
		}else if(num == 5) {
			System.out.println("프로그램이 종료됩니다.");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		switch(num) {
		case 1:
			System.out.println("입력 메뉴입니다");
			break;
		case 2:
			System.out.println("입력 메뉴입니다");
			break;
		case 3:
			System.out.println("입력 메뉴입니다");
			break;
		case 4:
			System.out.println("입력 메뉴입니다");
			break;
		case 5:
			System.out.println("입력 메뉴입니다");
			break;
		}
		*/
		}
		
		public static void prac2() {
			//5x5 사이즈의 2차원 배열에 다음과 같이 값을 저장하고, 출력하는 코드를 작성하시오.
			//규칙 찾아보기.

//			1 2 2 2 2
//			3 1 2 2 2
//			3 3 1 2 2
//			3 3 3 1 2
//			3 3 3 3 1
			
			int [][]arr = new int [5][5];	//초기화 0
			
			// 1 or 2 or 3
			
			//						5
			for (int i=0; i<arr.length; i++) { //i:0 1 2 3 4
				//						5
				for (int j=0; j<arr[i].length; j++) { //j:0 1 2 3 4
				if(i>j)	{
					arr[i][j]= 3;
				}else if (i<j) {
					arr[i][j]=2 ;
				}else {
					arr[i][j] = 1;
				}
				}
			
			}
			
			for (int i=0; i<arr.length; i++) { //i:0 1 2 3 4
				
				for (int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]+ " ");
				}
				System.out.println();
		}
		}
		
		
		public static void prac3() {
	
//			1.
//			2x + 4y = 10 이 만족하는
//			모든 x, y 쌍을 구하시오.
//			(x와 y는 자연수 1~10)
			
//			이렇게도 할 수 있다..
//			for (int x=1; 2*x<10; x++) {
//			for (int y=1; 4*y<10; y++) {
//			
			
			
			for (int x=1; x<=10; x++) {
				for (int y=1; y<=10; y++) {
					
					if (2*x+ 4*y == 10	) {
						System.out.printf("x:%d y:%d\n", x, y);	
					}
				}
			}
			
			
		}
		
		public static void prac4() {
//			2.
//			정수 2개를 입력 받아서,
//			아래 계산 결과를 출력하시오.
//			큰수 - 작은수
			
			
			Scanner scanner = new Scanner(System.in);
			System.out.print("두 개의 정수 입력 : ");
			int num1 = scanner.nextInt()	;		
			int num2 = scanner.nextInt()	;
			
			if(num1 > num2) {
				System.out.printf("%d- %d =%d\n", num1,num2,num1-num2);
			}else {	//num2 이 더 큼		(num1 == num2)
				System.out.printf("%d- %d =%d\n", num1,num2,num2-num1);
				}
		}									

		
		public static void prac5() {
//			3.
//			윷놀이 게임
//			4개의 윷을 입력받고 결과를 출력하시오.
//			(뒷도는 없습니다!)
//			0 : 안 뒤집어진 상태
//			1 : 뒤집어진 상태
//			ex) 입력 0 0 1 0
//			결과 도
//			입력 0 1 0 1
//			결과 개
			
			// 입력된 값을 모두 더하면 => 뒤집어진 윳ㅡ이 갯수 !
			
			//뒤집어진 수 
//			1 도
//			2 개
//			3 걸
//			4 윳
//			0 모

			Scanner scanner = new Scanner(System.in);
			
			int[] yutArr = new int[4];
			System.out.print("윳 값 입력(1:뒤집어짐, 0:안뒤집어짐):");
			 for (int i=0; i<yutArr.length; i++) {
				 yutArr[i] = scanner.nextInt()	;
			 }
			
			// 입력 값이 0 or 1 범위 안에서 입력이 되었는가?
			 int sum = 0;
			 for (int i=0; i<yutArr.length; i++) {
				 sum = sum + yutArr[i];		// 0 + 0 + 1 + 1
			 }
			switch(sum) {
			case 1:
				System.out.println("도");
			break;
				case 2:
					System.out.println("개");
				break;
					case 3:
						System.out.println("걸");
					break;
						case 4:
							System.out.println("윷");
						break;
						default:
							System.out.println("모");
							break;
			}
		}
			
			
			public static void prac6()	{
			
//			4. 입력받은 수 만큼 별 출력하기
//			ex) 4
//			****
//			5
//			*****
				Scanner scanner = new Scanner(System.in);
				System.out.print("숫자 한개 입력 : ");
				int num = scanner.nextInt()	;
				
				for(int i=1; i<=num; i++) {
					System.out.print("*");
				}
				System.out.println();
//			
				int i=1;
				while(i<=num) {
					System.out.print("*");
					i++;
				}
				
		}
		
}
