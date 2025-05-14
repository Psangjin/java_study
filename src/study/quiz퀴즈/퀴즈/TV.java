package study.quiz퀴즈.퀴즈;

public class TV {

	
	//	필드
	String company;
	int year;
	int inch;
	
	//	생성자
	TV(String company, int year, int inch) {
		this.company = company;
		this.year = year;
		this.inch = inch;
		
	// 메소드
		void show() {
			System.out.printin(company +"제품 "+year+"년형 " +inch+ "인치 TV");
		}
	}
	
	
}
