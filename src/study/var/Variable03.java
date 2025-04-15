package study.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 변수 타입변환
		double d1= 3.14;
		double d2= d1;	// double <- double
		
		int i1= 30;
		int i2= i1;	//int <- int
		
		//int 13= 3.33; 	//int 정수형 <- 실수 3.33 저장불가 XXX
		
		double d3 = i1;		//double <- int		자동타입변환 큰타입 = 작은타입
		
		int i3 = (int)d2; //작은타입 = (작은타입)큰타입 강제타입변환
		
		System.out.println(d2);		//3.14
		System.out.println(i3);	 	//3			강제타입변환시 소수점 0.14 손실
		
		//java 정수 -> int 타입 인식
		//java 실수 -> double 타입으로 인식
		
		float f1 = 5.5f;	//	float 타입에 = double 타입으로 변환하는 상황이라 작은타입으로 강제변환
		d3 = f1;			// double= float 자동으로 변환
		
		double d4 = 15;				//double 타입변수에 = int 값		15 -> 15.0 자동타입변환
		double d5= 15.5;
		System.out.println(d4);
		
		
		int i6 = 10;
		double d6 = 5.5;
		
		double result1 = i6+d6; 		// int+double --> double
		System.out.println(result1);
		
		//	int		= double
		//int result2 = i6 + d6;		// int + double
		int result2 = i6 + (int)d6;		// int+ int (5.5 ->5)
		
		result2 = (int)(i6+ d6);	//(int) 타입을 (double) 타입으로 강제변환
				// 	(int + double)
		System.out.println(result2);
		
		double dv1 =5.5;
		double dv2 =6.6;
																//		int 소수점 x
		int rst = (int)dv1+ (int)dv2;				//11
	//				5			6
				System.out.println(rst);
				
		rst = (int)(dv1 + dv2);						//12
	//				5.5+6.6
				System.out.println(rst);
					
					
					
					int x=1;
					int y=2;
					double z= x/ y;
						// int/ int -> 연산결과타입 int
						// 1/ 2 -> 0
					// z=0.0   double = int
					System.out.println(z);
				
					
					// 소숫점이 정확하게 결과 로 나오게 하기 위해서
					// 연산을 double 과 int 의 연산으로 바꾼다
					// int 값 한개 or 두개 모두를 (double) 실수형 으로 강제타입변환
					z = (double)x /y;  			//double / int => double
					z = x / (double)y;			//int	/double -> double
					z = (double)x / (double)y;  // double /bouble => double
					System.out.println(z);
					
					z= 10.0 / 3.0;			//int /int 실수형으로인식 소숫점으로 바꾸면 .0 double로 인식
		
					
					
					
					
					
		
 	}

}
