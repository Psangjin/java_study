package study.var;

public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수 (값을 저장할 수 있는 공간) ex) 박스, 바구니
		//변수 선언
		
		int number1;	//int: 정수형 숫자	 	바구니이름: number1
		int floor;		//정수형 숫자 담을 공간 (공간의 이름: floor)
		
//		int x;
//		int y;
//		int z;
		
		int x,y,z;
		
		int score; //변수 선언
		int point = 50; //변수 선언 + 값 저장 -> 변수 초기화
		
		// int score = 99; // 중복된 변수명 사용불가
		
		score = 90; //값 저장
		score = 80;
		score = 70;
		
		//hour = 15;		//변수 선언 이전에는 사용불가		
		int hour = 14; //정수형숫자 변수 선언 + 값 저장 -> 초기화 	공간(변수)이름 : hour
		
		//seconds = 31; //선언 안한 변수 사용 불가
		
		int minute = 14;
		
		minute = 21;
		minute = minute + 7;
		score = point + 20;
		
		int totalScore = point + point +score + score;
		//					50		50		70		70
		
		//출력은
		//System.out.println(괄호안에있는 값/문자 출력);
		System.out.println("안녕하세요");
		System.out.println(500);
		System.out.println(totalScore);
		System.out.println(2*60 + 43);		//syso + Ctrl + space 자동완성
		System.out.println(hour + "시" + minute + "분" );
		
		x = 10;
		y = x;
		z = x + y;
		
		// x:10 y:10 z:20
		
		int a = 10;
		int b = 20;
		
		// a: 10 b: 20
		// 서로 값 바꾸기
		// a: 20 b: 10
		
		/* 바꾸기 실패 케이스
		a = b; //a:20 b:20
		b = a; // a:20 b:20
		*/
		
		int c = a;  //a:10 b:20 c:10
		a = b;		//a:20 b:20 c:10
		b = c;		//a:20 b:10 c:10
		
		
		
		

	}

}
