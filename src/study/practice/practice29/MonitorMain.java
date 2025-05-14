package study.practice.practice29;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monitor m1 = new Monitor("삼성", 27, 150000);
		m1.color = "검은색";
		m1.setColor("검은색");
		m1.setXY(1080, 780);
		
		Monitor m2 = new Monitor("LG", 32, 330000);
		m2.setColor("흰색"	);
		m2.setXY(4096, 2048);
	
		
		m1.printInfo() ;
		m2.printInfo();
		
		int m2Price = m2.addPrice(70000); //return
		System.out.println("m2 모니터 인상 후 금액 : "+m2Price);
		
		m1.printInfo();
		m2.printInfo();
	}
	

}
