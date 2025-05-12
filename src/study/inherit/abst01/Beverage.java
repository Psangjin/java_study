package study.inherit.abst01;

//abstract class 추상클래스
public abstract class Beverage { //음료
	String name;
	int ml;
	
	public void intro() {
		System.out.println("저는 음료입니다.");		
	}
	
	//추상메소드 선언부분만
	//코드 실행부분 구현 x	선언만 넣음	자식들은 필수로 구현해야함
	public abstract void checkSafety();
	//안전검사
	
	//마시기위해서 뚜껑을 열어야 한다!
	public abstract void open();
	
	
}
