package study.practice.practice29;

public class TV {

	//필드
	String company;
	int year;
	int inch;
	
	//성생자
	TV(String company, int year, int inch) {
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	//메소드
	
	void show() {
		System.out.printf("%s제품 %d년형 %d인치 TV\n", company, year, inch);
	}
	
}
