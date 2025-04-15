package study.oper;

public class Operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//연산자
		
		
		//산술 연산
		System.out.println(1+1);
		System.out.println(2-1);
		System.out.println(3*2);
		System.out.println(4/2);
		System.out.println(9%5);	//9 나머지 연산 5
		
		//부호 연산
		System.out.println(30);
		System.out.println(+30);
		System.out.println(-30);
		System.out.println(-(-30));
		
		//증감 연산 ->> 증가 감소		++	-- 앞/뒤
		System.out.println("============증감===========");
		
		int x=10;
		int y=20;
		int z=30;
			
		System.out.println(x--);	//x값 10 출력 	-> x:9
		System.out.println(x);		// x:9
		
		System.out.println(++y);	//y값 21			-> 21출력
		System.out.println(y);		// y: 21
		
		System.out.println(z+1);	//31
		System.out.println(z);		//30
		
		
		int q = 1;					//	2
		int	w = 3;					//	2
		int e = 10 + ++q;			//	12
		int r = 3 + w--;			//	6
		
		System.out.printf("%d %d %d %d\n", q, w, e, r);
		
		
		
		//논리 부정 연산			! ture <-> false
		boolean isHungry =  false;
		System.out.println( isHungry );
		System.out.println( !isHungry );			// 그 시점에만 연산일어나고
		System.out.println( isHungry );				// 원본데이터는 안바뀜 변화x
		
		
		
		//비교 연산
		System.out.println("=============비교 연산============");
		System.out.println( 10 == 10 );		// 값이 서로 같으냐
		System.out.println( 5 != 5 );		// 값이 서로 다르냐?
		
		System.out.println( 5 > 3);
		System.out.println( 5 >= 3);
		System.out.println( 5 < 3);
		System.out.println( 5 <= 3);
		
		boolean b1 = (9>=8); ///true
		System.out.println(b1);
		
		
		
		//논리 연산자		&& and || or
		System.out.println("==============논리 연산==============");
		boolean b2 = (10>6 ) && (10>5);
				//		true	true		
		System.out.println(b2);
		boolean b3 = (5!=1)||(10<4);
				//		true	false
		System.out.println(b3);
		boolean b4 = (2>=1) && !(3<4);
				//		true		false
		System.out.println(b4);
		
		
		
		
		//대입 연산
		System.out.println("==============대입 연산==============");
		int a= 30;		// 단순 대입
		     //	복합 대입
		a += 5;			//a = a + 5;
		a -= 3;			//a = a - 3;
		a *= 3;			//a = a * 3;
		a /= 2;			//a = a / 2;
		a %= 4; 		//a = a % 4;
		
		
		
		//삼항 연산자
		// (조건식) ? 앞 : 뒤
		System.out.println("==============삼항 연산==============");
		
		int point = 50;
		String item = (point >= 100) ? "커피" :"생수";		//참 앞에 것
		System.out.println(item);
		
		item = (point < 100) ? "생수" : "커피";				//거짓 뒤에 것
				
		// point >= 100 --> point < 100
		// poitn > 50	--> point <= 50
			
		// 이벤트 음료 조건
		// 0~100 	: 생수
		// 101~200 	: 커피
		// 201~		: 맥주
		point = 70;
		item = (point <= 100) ? "생수" : (point > 200 ? "맥주" : "커피");
		System.out.println(item);
		
		item = (point <= 200 ) ? (point > 100 ?"커피" : "생수") : "맥주"; 
		System.out.println(item);
		
		
	}

}
