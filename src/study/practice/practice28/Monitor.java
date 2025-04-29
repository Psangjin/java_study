package study.practice.practice28;

public class Monitor {

	
	//필드
	int inch;
	String company;
	String model;
	
	//생성자
	Monitor(int inch, String company, String model	) {
		this.inch	 = inch;
		this.company	= company;
		this.model	= model;
	}
	
	
	//메소드
	void printInfo() {
		System.out.printf("제조사:%s 모델명:%s 인치:%d인치\n", company, model, inch);
	}
	
}
