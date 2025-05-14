package study.practice.practice29;

public class Monitor {

	
	
	//필드(속성)
	String company;
	int inch;
	int price;
	String color;
	
	int maxResolutionX;
	int maxResolutionY;
	//Recoulution
	//3840 * 2048
	//1920 * 1024
	
	
	
	//생성자
	Monitor(String company, int inch, int price)	 {
		this.company = company;
		this.inch = inch;
		this.price = price;
		
	}
	
	//메소드
		
	void setXY(int maxResolutionX,int maxResolutionY) {
		this.maxResolutionX = maxResolutionX;
		this.maxResolutionY = maxResolutionY;
	}
	
	void setColor(String color) {
		this.color = color;		//this 입력안하면 저장이 안된다. 속성.
		//입력 -> 수행할 코드 -> 출력
		//매개변수 -> 코드 -> return
	}
	
	void powerON( ) {
		System.out.println("전원이 켜졌습니다.");
	}
	
	int addPrice(int addPriceValue) { //매개변수로 증가할 금액을 입력받기
		//금액인상 실행코드
		this.price = this.price + addPriceValue;
		//15만 + 3만 -> 18만원
		
		return this.price;
		
		//출력/반환/return 인상된 금액
	}
	
	void printInfo() {
		System.out.printf("%s %d인치 %s 모니터 가격:%d원 해상도:%d * %d \n",
			company, inch, color, price, maxResolutionX, maxResolutionY);
	}
		
}
