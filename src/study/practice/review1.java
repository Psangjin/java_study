package study.practice;

public class review1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//변수		:  값을 저장 한다
		
		
		// 데이터 (값) 저장 하는 공간
		
		/*
		  int		: 정수형			1241414
		  double	: 실수형(소수점)	1231.141
		  boolean 	: 논리형		true	false
		  String	: 문자형		"어떤" "1214"
		 */
		
		// 정수형 변수
		int age = 22;
		
		//출력 방법
		System.out.println(age);  		// 내용 출력후 줄바꿈
		System.out.print(age);			// 내용 출력만 줄바꿈 xx
		System.out.printf("내 나이는 %d살 입니다.\n", age); 	// 특정 형식에 맞춰서
							// 정수면 %d	실수면 %f	 문자열 %s
							// \n 	줄바꿈
		
		String weather = "맑음";	//자바에서 문자열을 표현할 때는 ""(큰따옴표) 감싸서 표현한다.
		
		System.out.println(" 오늘의 날씨는 " + weather);
		System.out.print(" 오늘의 날씨는 " + weather);
		System.out.println();	//줄바꿈
		System.out.printf(" 오늘의 날씨는 %s\n", weather);
		
		
		boolean tired = true;	//boolean 참 거짓 판별
		
		System.out.println(tired);		//true 가지고 있는 상태에서는 true
		
		tired = false;
		System.out.println(tired);		//false 가지고 있는 상태에서는 false
		
		
		int n1 = 10;
		int n2 = 20;
		// n1 + n2;
		
		int n3 = n1 + n1 + n2 * n1 ;	//이렇게 사용가능
		
		System.out.println(n1 + n2); 	// (연산가능한) 숫자들 연산 ->	연산 
		// 연산 숫자와 문자열이 만나면 -> 그냥 앞뒤로 이어붙이기~
		System.out.println(n1 + "20");
		System.out.println("n1:" +n1 + " n2:"+ n2 + " n3:"+n3);
		
		int total = 3;
		total = total + 2; 
		total = total + 5;
		
		int order1 = 3;
		int order2 = 2;
		int order3 = 5;
		
		String name ="가나다라마바사";
		String name1 ="가";
		String name2 ="나";
		String name3 ="다";
		///..
		
		// 배열 : 같은 타입의 데이터 여러개를 붙여서 한번에 관리 저장 공간
		
		System.out.println(name1+"님");
		System.out.println(name2+"님");
		System.out.println(name3+"님");
				
		String []names = {"배열"
	}

}
