package study.inherit.inter.interface01;

public interface Interface01 {

	//인터페이스
	
	//필드 XX -> 변수 선언 하면 (상수가 됨)
	//필드 변수 없음					상수이기 때문에 변수명은 모두 대문자 입력
	static final int TYPE = 500;
	/*앞에 항상 붙어있음 /*static final*/ int CODE = 10;
	
	//붕어빵 속 토핑 종류
	int FISHBREAD_TOPPING_PPAT = 11;
	int FISHBREAD_TOPPING_SUCTEAM = 12;
	int FISHBREAD_TOPPING_PIZZA = 13;
	int FISHBREAD_TOPPING_KIMCHI = 14;
	
	//생성자 -> XX
	//생성자 없음
	
	//메소드 -> 메소드 선언가능 하지만 추상 메소드라고 생각하면 됨 (선언부분만 가능)
	public abstract void method1();	//추상메소드	abstract 가 붙어있다.
	public void method2();	//추상메소드
	
}
