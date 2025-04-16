package study.cond;

public class Conditional01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 조건문 			if
		
			int num= 5;
												//if 문 거짓이면 실행이 안됨
			if (num > 10 )	{
				System.out.println("Hello");
				System.out.println("num이 10보다 크더라~");
			}
		
			if (num <= 20 )	{
					System.out.println("20보다 작거나 같더라~");
					System.out.println("하하하하~");
			}	
			
			if (num != 5) {  	// 중괄호가 없으면 조건문 다음 1줄만 if문 범위에 종속됨
				System.out.println("살펴봤더니");
				System.out.println("5는 아니더라~");		// 중괄호 안넣으면 if문 2줄부터는 범위에 들어가지 않음. 
			}
			
						
			boolean b1 = ( num == 5 );
			// 삼항연산자 (조건식) ? 참 : 거짓
			// if (b1) { 조건문 if (조건식) }
			if (b1 == true) {// if문 조건식에서도 true false 구분하고 결과 실행 가능
				System.out.println("num이 5다");
			}
			
			// 변수의 범위 (지역 변수)
			if (b1) { 	// true
				System.out.println("b1 조건문 내부 "+num);
			
				int x = 100;
				System.out.println("if문 중괄호 안에 x 값 = " + x);
								// 중괄호 안에서만 사용가능 
			}
			
			
			
			int x= 200;		// if문 지역변수라서 밖에 있는 것과 별개 인지 못함. 같은 x 인데 사용가능
			System.out.println("if문 중괄호 밖의 x 값 확인 : "  + x);
			
			
			
	
			
			
			
				System.out.println("프로그램 끝");
		
				
				
				
				
	}

}
