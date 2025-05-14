package study.practice;

public class asasas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//	prac1( );
		//	prac2v1( );
			prac2v2( );
		//	prac3v1 ();
		//	prac3v2 ();
		//	prac4() ;
	}

	
	
	
	public static void prac1 () {
//		1.
//		두 개의 주사위를 던졌을 때, 두 눈의 합이 6이 되는
//		모든 경우의 수를 출력하는 프로그램을 작성하시오.
		
		for(int x=1; x<=6; x++) {
			for(int y=1; y<=6; y++) {
				if(x+y == 6) {
					System.out.println("x:" + x + " y:"+ y);
				}
			}
		}
	}
	
	public static void prac2v1 () {
//		로또 번호 6개 랜덤하게 생성하기. ( 1~45 중 )
//		최종 6개의 번호는 6칸의 배열에 저장되어야 한다.
//		로또 번호는 동일한 번호가 중복되어 들어갈 수 없다.
//		1) Math.random() 활용
//		2) int[] lotto = new int[6]; 활용
		
		
			
	}
	public static void prac2v2 () {
	//	6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
//		int x = 111;
//		int y = 13;
//		int result = _____;
//		System.out.println(result);
//	
//		1) 출력결과 : 7
//		2) 출력결과 : 8
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println((a < b) && (c >= a));
		System.out.println((a == b) || (a >= b) || (c > 10));
		boolean result = !(c == 3);
		System.out.println(result);
		
		
	}
	
	public static void prac3 () {
		
	}
	
	public static void prac4 () {
		
	}
	
	public static void prac4v1 () {
		
	}
	
	public static void prac4v2 () {
		
	}
}
