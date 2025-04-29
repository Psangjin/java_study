package study.cls.cls01;

public class Calculator {

	
	//계산기라는 개체를 표현하기위한 객체
	
	//필드
	String brand;
	
	//생성자
	
	
	
	
	//메소드 (동작/기능)
	
	/*
	  	리턴		매개변수
	 	 O		  O	
	     O		  X
	     X		  O
	     X		  X
	 
	  리턴X : void 
	  리턴O : 리턴할 타입
	 
	 
	 */
	
	//리턴X 매개변수X
	//계산기 전원켜는 메소드
	void powerOn() {
		System.out.println("Power On!!");
		//return;			// 여기서 사용되는 return은 break; 종료
	}
	
	//리턴X 매개변수O
	// 원하는 밝기 수치를 받아서 밝기 조절기능 메소드
	// 밝기 :  1 ~ 10 가정
	void setBrightness (int bright) {
		System.out.println("밝기수치 " + bright + "로 조정합니다.");
	}
	 
	//리턴 O 매개변수X   리턴이 있으면 String 등등 사용
	String getInfo() {
		
		//메소드 실행후 반환(return) 할 값을 작성
		String s = "전자계산기";
		return s;
		
		//String s = "전자계산기";
	}//지금 상태에서는 String에 return이 들어가야 한다.
	
	
	//리턴 O 매개변수 O
	//숫자 2개를 받아서 두 숫자의 합을 반환하는 기능 더하기
	int sum (int x, int y)	 {
		int result = x+ y ;
		return result;
	}
	
	int sumArr (int[] arr) {
		int sum =0 ;
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	
	
	
	
	
}
