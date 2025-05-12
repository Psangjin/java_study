package study.inherit.abst01;

//테라 맥주
public class Tera extends Beverage {

	@Override
	public void checkSafety() {
		System.out.println("알콜 도수 정상 체크");		
	}

	@Override
	public void open() {
		System.out.println("병따개로 펑~");		
	}
	
//	String name;
//	int ml;
	
}
