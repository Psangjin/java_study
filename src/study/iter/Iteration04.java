package study.iter;

public class Iteration04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//반복문 중첩 !!
		
		for (int i=1; i<=3; i++) {
			System.out.println("밖 외부에 있는 for문");
			
			for (int j=1; j<=4; j++) {
				System.out.println("안 내부에 있는 for문");
			}
		}
		
		for (int i=1; i<=3; i++) {
			System.out.print("i"+ " ");
			
			for (int j=1; j<=4; j++) {
				System.out.print("j"+ " ");
			
				for (int k=1; k<=3; k++) {
					System.out.print("k"+ " ");
					
			}
		}
		
			
		}
			System.out.println();
			int i=1;
			while (i<=3) {
				System.out.println("1111");
				
				int j=1;
				while (j<=4) {
					System.out.println("2222");
					j++;
				}
				i++;
			}
			
			
			for (i=1; i<=3; i++) {
				System.out.println("i:"+i);
				
				for (int j=1; j<=4; j++) {
					System.out.println("j:"+j);
				}
			}
			
		// 청소를 한다!!
			
			//방이 3개 짜리
			//	청소루틴 	2번 쓸고
			//			3번 닦기
			//			1번 쓰레기 정리
			
			for (i=1; i<=3; i++) {// 조건식은 내가 언제 까지 할거냐
					
				System.out.printf("%d번 방 청소\n",i);
				
				int j=1;
				while (j<=2) {
					System.out.println("쓸기");
					j++;
				}
				for(int k=1; k<=3; k++) {
					System.out.println("닦기");
				}
				
				System.out.println("쓰레기 정리"); //반복문은 여러가지 반복할 때 쓰기 하나면 출력할 때는 필요없다
			}
			
			
			
	}

}
