package study.quiz퀴즈.퀴즈;

public class moniter {

	
	
	//필드
	int inch;
	String make;
	String model;
	
	
	//생성자
	
	moniter () {
	}
	
	moniter (int inch, String make, String model) {
		this.inch = inch;
		this.make = make;
		this.model = model;
	}
	
	
		
	//메소드
		
	void printmoniterInfo() {
		System.out.println("제조사:"+ make +" 모델명:"+model+" 인치:"+inch+"인치" );	
	}
		
}
