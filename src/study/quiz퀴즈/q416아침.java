package study.quiz퀴즈;

public class q416아침 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 아래 코드에서 예상되는 출력 결과를 작성하세요
		int x = 2;
		int y = 3;
		int z;

		System.out.println("x="+x + " y="+y);
		System.out.println(x + y);
		System.out.println(x++ + y++);
		System.out.println("x="+x + " y="+y);
		z = ++x + ++y;
		System.out.println("x="+x + " y="+y);
		z--;
		x += --y;		// x= x+ --y	x=4+4
		System.out.println("x="+x + " y="+y + " z="+z);
		x = 10;
		z = x/y++;
		System.out.println("x="+x + " y="+y + " z="+z);
		System.out.println("x="+(x*2) + " y="+ ++y + " z="+z);
		System.out.println("x="+x + " y="+y + " z="+z);

		
		
		//2. 아래 조건에 대한 출력 결과를 예상해서 작성하세요
		int a = 1;
		int b = 2;
		int c = 3;
		System.out.println( (a<b) && (c>=a) );
		System.out.println( (a == b ) || ( a >= b) || (c > 10) );
		boolean result = !(c == 3);
		System.out.println( result );
		
		
		/*
		3. 아래 조건 범위에 맞춰서 결과가 나올 수 있도록, 삼항연산자 코드를 완성하세요.

		점심 메뉴 가격에 따라서 아래 결과를 출력하고 싶습니다.
		6000원 이하 -> "훌륭"
		6000원 초과 ~ 8000원 -> "선방"
		8000원 초과 ~ 12000원 -> "눈물"
		12000원 초과 -> "물로배채우기"
*/
	//	int menuPrice = 30000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
	//	String result = ________;
		
		/*
	//	int menuprice = 13000;
				String taste = (menuprice<= 6000) ? "훌륭" : "안훌륭";
		
				System.out.println(taste);
				
		//	menuprice = 7000;
				taste = (menuprice > 6000) ? "선방" : (menuprice >= 8000 ? "선방" : "훌륭한거 먹어야겠네");
	
				System.out.println(taste);
				
		//	menuprice = 9000;
				taste = (menuprice > 8000) ? "눈물" : (menuprice >= 12000 ? "눈물" : "뭐먹을래");
	
				System.out.println(taste);
	
		//	menuprice = 13000;
				taste = (menuprice > 12000) ? "물로배채우기" : "뭐먹지";
	
				System.out.println(taste);
	
	*/
				int menuPrice = 8000;		//점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
				String result3 = (menuPrice > 8000) ? 			//조건식
									(menuPrice > 12000 ? "물로배채우기" : "눈물") 	//참 일 때
							  	:   (menuPrice > 6000 ? "선방" : "훌륭" );			//거짓 일 때
				
					result3 = (menuPrice > 12000) ?	"물로배채우기"
								: (menuPrice <= 6000 ? "훌륭");
				
				
				
				
				System.out.println(result3);
									
				
	
	}
	
}
