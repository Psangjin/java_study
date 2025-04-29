package study.quiz퀴즈.퀴즈;

public class moniterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		moniter m1 = new moniter() ;
		
		m1.inch = 65;
		m1.make = "삼성";
		m1.model = "더프레임";
		
		System.out.println("제조사:"+m1.make +" 모델명:"+m1.model +" 인치:"+m1.inch+"인치" );
	
	
		moniter m2 = new moniter() ;
		
		m2.inch = 80;
		m2.make = "LG";
		m2.model = "올레드";
		
		System.out.println("제조사:"+m2.make +" 모델명:"+m2.model+" 인치:"+m2.inch+"인치" );
	
	
		m1.printmoniterInfo();
		m2.printmoniterInfo();
	
	}
	

}
