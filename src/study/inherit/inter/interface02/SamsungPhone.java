package study.inherit.inter.interface02;

public class SamsungPhone implements Callable {

	//필드변수
	int callStatus;	//전화 상태
	
	@Override
	public void call() {
		System.out.println("삼성폰 전화통화");
		callStatus = Callable.CALL_ON;
		
	}

	@Override
	public void connect() {
		System.out.println("삼성폰 블루투스 연결");
		
	}

	@Override
	public void disconnect() {
		System.out.println("삼성폰 블루투스 연결 종료");
		
	}

}
