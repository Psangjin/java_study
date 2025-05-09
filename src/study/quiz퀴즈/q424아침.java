package study.quiz퀴즈;

import java.util.Scanner;

public class q424아침 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		우리 학원은 3개의 반이 있으며, 한 반에 5명씩 공부하고 있다.
		반 순서별로 5명의 점수를 입력받아서 저장해서 관리하도록 하며,
		각 반별 점수의 평균과 전체의 평균을 출력할 수 있도록 코드를 작성하시오.
		(*가능한 효율적인 구조를 생각해보세요)

		ex)
		1반 : 10 10 10 10 10
		2반 : 20 20 20 20 20
		3반 : 30 30 30 30 30

		1반 평균 : 10
		2반 평균 : 20
		3반 평균 : 30
		전체 평균 : 20
		 */
		int [] avr	=	{ 10, 20, 30, 40, 50};
		
		Scanner scanner = new Scanner(System.in);
		int[] numArr	=	new int[5];
		System.out.print("반 순서별로 5명의 점수 입력 : ");
		
		for (int i=0; i< numArr.length; i++	 ) {
			numArr[i]= scanner.nextInt()	;
		}
		
		
	}

}
