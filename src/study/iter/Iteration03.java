package study.iter;

public class Iteration03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//반복문 Break
		int i=1 ;
		
		//for ( int i=1; i<=10; i++)
		while (1<=10) {
			System.out.println(i);
			i++;
			
			if (i==5)
			break;  // 실행중인 반복문을 끝내는 것
		}
		
		
		//무한루프
		int energy =100;
		while (true) {
			System.out.println("달린다~");
			energy --;
			if (energy == 0)
				break;
		}
						//조건식에 true 사용가능 무한루프
		for (energy=50; energy>0; energy--) {
			System.out.println("달린다~");
			
			if(energy == 0)
				break;
		}
		
		
		
		/*
		 * 반복(true) {
		 * 멈춰야하는 사전 조건 확인 (사전 필터링)
		 * 
		 * if (유통기한 남았나 ?)
		 * break ;
		 * if (이상한 냄새가 안나나 ?)
		 * break ;
		 * if (곰팡이가 생겼나 ?)
		 * break ;
		 * if (먹을게 남았나 ?)
		 * break ;
		 * 
		 * 실행
		 */
		
		
		System.out.println("========================================");
		
		//continue 문
		
		for (i=1; i<=10; i++) {
			
			
			if (i==5)
			continue;					// continue 해당 되는 한 턴을 쉬고 계속 진행
				//	break;
			if (i==7)
				break;					// break 종료 아래로
			System.out.println(i);
			
		}
		
		
		
		
		
		
		
		
		
	}

}
