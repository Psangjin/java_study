package study.practice.practice28;

public class Monitor {

	
	//필드
	String company;
	int inch;
	int pay;
	String color;
	int highResolution;
	int lowResolusion;

	
	//생성자
	Monitor(String company, int inch, int pay) {
		
		this.company	= company;
		this.inch	 = inch;		
		this.pay	= pay;
	}
	
	
	//메소드
	void printInfo() {
		System.out.printf("제조사:%s 모델명:%s 인치:%d인치\n", company, model, inch);
		
	void setXY (int XY) {
		System.out.println();
	}
	
	void powerOn {
		System.out.println("전원이 켜졌습니다.");
	}
	
	}
	
}
