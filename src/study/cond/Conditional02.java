package study.cond;

public class Conditional02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int dice = 5;
		
		if(dice ==1) {
			System.out.println("한칸 전진");
		} else {
			System.out.println("1이 아닐 때 할 행동1");
			System.out.println("1이 아닐 때 할 행동2");
			System.out.println("1이 아닐 때 할 행동3");
		}
		
		
		/*
		 * 	if()
		 *  if()
		 *  
		 *  if()
		 *  else
		 * 	
		 * 					if() 
		 * 다음에 무조건 else가 쓰일 필요는 없다.
		 *  if()
		 * 	else if()
		 *  else if()
		 *  else	
		 *  					else  ,  else if() 	단독사용 불가
		 */
		
		if (dice == 1) {
			
		}	else if (dice == 2) {		
			
		}	else if (dice == 3) {
				
		}	else {
		
		}
		
		
		if (dice == 1) {
			
		}
		if (dice == 2) {
			
		}
		if (dice == 3) {
			
		}
		
		
		// 구분이 제대로 안되는 케이스 -> 구분 하도록 - if 만 활용한 케이스
		
		int menuPrice = 10000;
		
		if (menuPrice <= 6000) {
			System.out.println("훌륭");
		}
		if ( menuPrice > 6000 && menuPrice  <= 8000) { 
			System.out.println("선방");
		
		
		
		
		
	//	int menuPrice = 12200;
		
		if (menuPrice <= 6000) {
			System.out.println("훌륭");
		}else if (menuPrice  <= 8000) { // 가격 <= 6000 false 확정 여기 else if 문으로 내려온것 자체가 6000이 초과한다는 뜻.
			System.out.println("선방");
		}else if (menuPrice <= 12000) {
			System.out.println("눈물");			
		}else {
			System.out.println("물배채우자");
		}
		
		// 로직이 잘못된 케이스
		// if 조건문 -> 중첩 사용 가능
		if (menuPrice > 6000) {
			System.out.println("훌륭");
			//중첩 if 문
			if (menuPrice > 12000) {
				System.out.println("물배채우자");
			}
		}else if (menuPrice > 8000) {
			System.out.println("선방");
		}else if (menuPrice > 12000) {
			System.out.println("눈물");			
		}else {
			System.out.println("물배채우자");			
		}
		
		}
	}	
}