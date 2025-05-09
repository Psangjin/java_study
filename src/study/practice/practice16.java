package study.practice;

import java.util.Scanner;

public class practice16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		prac1();
//		prac2();
//		prac3();
		
		
	}
	public static void prac1() {
//		1.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		몇번째 수인가요? : 그에 해당하는 수를 출력
//		ex) 10 20 30 50 90
//		몇번째 수인가요? 5
//		결과 : 90
		
		//배열
		int [] arr = {10, 20, 30, 50, 90};
		
		// index : 0 1 2 3 4
		// 사용자 : 1 2 3 4 5
		
		// 실제 사용자가 선택한 번째 수 -1이 인덱스 위치 이다.
		
		Scanner scanner = new Scanner(System.in);
		int[] numArr = new int [5];
		System.out.print("5개 수 입력 : ");
		
		for (int i=0; i< numArr.length; i++) {
			numArr [i]=scanner.nextInt()	;
		}
		
		//이것도 가능하지만
//		numArr[0]= scanner.nextInt()	;
//		numArr[1]= scanner.nextInt();
//		numArr[2]= scanner.nextInt();
//		numArr[3]= scanner.nextInt();
//		numArr[4]= scanner.nextInt();
//		
		
		
//		int n1 = scanner.nextInt()
//				int n2 = scanner.nextInt()
//						int n3 = scanner.nextInt()
//								int n4 = scanner.nextInt()
//										int n5 = scanner.nextInt()
	System.out.print("몇번 째? 입력 : ");
		int index= scanner.nextInt();
		
		System.out.print(numArr[index-1]);
		
		
		
		
		
		//이것도 가능은 한데 더 좋은 방법이 있다.								
//		if(index == 1)
//			System.out.println(n1);
//		else if(index ==2)
//			System.out.println(n2);
//		
		
	}
	public static void prac2() {
//		2.
//		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
//		받은후에 순서를 거꾸로 출력하세요.
//		ex) 1 2 3 4 5
//		결과 : 5 4 3 2 1
		
		// 0 1 2 3 4
		// 4 3 2 1 0
		
		// 4 3 2 1 0
		// 0 1 2 3 4 
		
		// n5 n4 n3 n2 n1
		
		Scanner scanner = new Scanner(System.in);
		int[] numArr = new int [5];
		
		System.out.print("5개 수 입력 : ");	
		
		for (int i=0; i< numArr.length; i++) { // 0 1 2 3 4 입력
			numArr [i]=scanner.nextInt()	;
		}
		//for( int i=numArr.length-1; i>=0; i--) 
		for( int i=4; i>=0; i--) { //   4 3 3 2 1
			System.out.print(numArr[i]+" ");
		}
		
		
	}
	public static void prac3() {
//		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
//		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
//		1   2   3   4
//		5   6   7   8
//		9  10 11 12
//		13 14 15 16
		
	//	int [][] arr = {{1,2,3,4}, {5,6,7,8,}, {9,10,11,12}, {13,14,15,16}};
		//다른 방법
		int[ ][] arr= new int [4][4]; 
		
		int num =1;
			for (int i=0; i<arr.length; i++) { 
				for(int j=0; j<arr[i].length; j++) {
					arr [i][j] = num;
					num++;
					//i : 0		  0		  2
					//j : 0 1 2 3 0 1 2 3 0  1  2  ...
					//n : 1 2 3 4 5 6 7 8 10 11 12 ...
					
					// 이렇게 할 수도 있다
					arr [i][j] = (4*i) + (j+1);
					
				}
			}
				
				
				
		for (int i=0; i<arr.length; i++) { // i: 0 1 2 3 행 인덱스 작동.
			for(int j=0; j<arr[i].length; j++) {
				//System.out.printf(arr[i][j] + " ");
				System.out.printf("%3d", arr[i][j]);
			}
				System.out.println();
		}
		
		
		
	}
	
		
		
	}


