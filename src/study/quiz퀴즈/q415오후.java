package study.quiz퀴즈;

public class q415오후 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/* 
	1. 아래 1), 2) 에 맞게 풀이.
	int x = 10;
	int y = 4;
	___result = ___x/y;
	System.out.println(result);

	1) 결과가 2가 나오도록 작성하세요
	2) 결과가 2.5가 나오도록 작성하세요
	*/
	//	int x = 10;
	//	int y = 4;
		
		//1) 결과가 2가 나오도록 작성하세요
	//	double result= x / y;
	//	System.out.println(result);
		//2) 결과가 2.5가 나오도록 작성하세요
	//	result=(double)x /y ;
	//	System.out.println(result);
		
		//답 1번 	int result= x/y;					//int / int -> int
		
		//답 2번 	double result= (double)x/y;			//double / int -> double
		
		
	/*	
	2. 결과가 7.5가 나오도록 작성하세요
	double a = 3.5;
	double b = 4.7;
	double result = _______________;
	System.out.println(result);
	*/
		//2. 결과가 7.5가 나오도록 작성하세요
	//	double a = 3.5;
	//	double b = 4.7;
	//	double result1 = a+(int)b;
	//	System.out.println(result1);
		
		//답 	double result = a+ (int)b;
		
		
	/*
	3. 계산결과가 12가 나오도록 작성하세요
	String a = "3.4";
	String b = "4";
	______ result = ________;
	System.out.println(result);
	*/
	
	//	String a1 = "3.4";			//string -> 숫자로 바꾸기
	//	String b1 = "4";			//string -> 숫자로 바꾸기
		
	//답		int result = (int)Double.parseDouble(a1) * Integer.parseInt(b1);
	//답		System.out.println(result);
		
//		int e = Integer.parseInt(c);
//		int f = Integer.parseInt(d);
//		System.out.println(e*f));
		
		
	/*
	4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
	String a = "10";
	int b = 3;
	double c = 4.5;
	_____ result = _______;
	System.out.println(result);
	*/
		
	//	String a = "10";
	//	int b = 3;
	//	double c = 4.5;
	
		//답 첫째. 	String result = a+ (Integer.parseInt(a) + b);
		//답 둘째.	String result = a + ( (int) ( b*c) );
	//	System.out.println(result);
		
		
//		System.out.println("%d", q);
		
	/*
	5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
	int a = 4;
	double b = 3.4;
	String c = "6.8";
	_____ result = _______;
	System.out.println(result);
	*/
	
		int a1 = 4;				//	"" +2 + 4+ 3 = "243"
		double b1 = 3.4;		//	String.valueof(24) + 3 = "243"
		String c1 = "6.8";
		
		//답 첫째.	String result =""+ ( (int)Double.parseDouble(c1) - a1 ) + a1 + (int)b1;
		// System.out.println(result);
		//답 둘째.	String result = ""+ (a1 * (int)Double.parseDouble(c1))+ (int)b1;
		
	//	System.out.println(a1+b1+Integer.parseInt(c1));
		
		
	/*
	6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
	int x = 111;
	int y = 13;
	int result = _____;
	System.out.println(result);

	1) 출력결과 : 7
	2) 출력결과 : 8
			*/
		
		int x1 = 111;
		int y1 = 13;
		//1) 출력결과 : 7
		System.out.println(x1/y1-1);
		//2) 출력결과 : 8
		System.out.println(x1/y1);
		// 답 첫째.	int result = x % y;
		// 답 둘째.	int result = x / y;
		
		
	}

}
