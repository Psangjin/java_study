package study.iter;

public class Iteration02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반복문 while
		/*
		while (조건식) {
			실행문
		}
		*/
		// i값이 진행되는 동안 1, 2, 3, 4, 5 로 바뀐다
		for (int i =1; i<=5; i++) {
			System.out.printf("피곤하다~?"+" ");			//for 문 조건식 다음 증감식 실행
		}
		System.out.println();
		
		int i=1;	//초기화 하고
		while (i<=5) {	//여기서 조건식 작성
			
			System.out.println("화이팅 !");  // <-- 실행문		//while 문 
			
			i++ ;  // <-- 증감식
		}
		
		System.out.println("=============================");
		
		
		// 1~ 5 출력하고 싶다.
		i = 1;
		while (i<=5) {
			System.out.println(i);
			i++;
		}
		System.out.println();
		
		i= 0;
		while (i<5) {
			System.out.println(i);
			i++;						//( i++ 위치에 따라 값이 바뀐다.
		}
		System.out.println();
		
		i= 0;
		while (i<5) {
			i++;						//( i++ 위치에 따라 값이 바뀐다.
			System.out.println(i);
		}
		System.out.println();
		
		//do while
		
		i =6;
		while (i<5) {
			System.out.println("i<5");
		}
		do {
			System.out.println("i<5");
		}while (i<5);	// do while 은 while 뒤에 ;(세미콜론) 필요함.
		
		
		
		
	}
	

}
