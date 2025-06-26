package retest;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 

	
		
		// 1~6 까지 랜덤
		// Random random(6)		0~5 	+ 	1		
		//(int)(Math.random() *6) +  1		
		
		//랜덤 결과값
		 
		// 룰렛 메소드
	    public void playRoullet() {
	        int randomNum = (int)(Math.random() * 6) + 1; 
	        if (randomNum <= 4) { 
	            System.out.println("성공: " + randomNum);
	            sucessCount++; 
	            totalPay = totalPay + randomNum; 
	        } else {
	            System.out.println("실패");
	            failCount++; 
	        }
		
		/*
		 	if(1<= 점수 <= 4)
		 		성공	->	점수
		 	5 6
		 		실패		 		
		 */
		
		/*
		 	금액충전 : 입력 돈
		 			돈입력 : int 돈 = scanner.mextInt();		 			
		 			1000 ->	2회
		 			
		 	잔여횟수(시도횟수) =	2;
		 	매출액 += 1000		 	
		 	충전 5000원
		 	
		 	잔여횟수(시도횟수) = 충전한 금액/ 500 = 총 시도 횟수
		 	매출액 += 5000
		*/
	        
	        public void charge() {
	            Scanner in2 = new Scanner(System.in);
	            System.out.print("충전할 금액 입력(1000원에 2회): ");
	            int inputMoney = in2.nextInt();

	            // 충전한 금액이 1000원 단위로만 입력 가능
	            if (inputMoney < 1000 || inputMoney % 1000 != 0) {
	                System.out.println("1000원 단위로만 충전이 가능합니다.");
	            } else 
	                
		
	            	
        	public void 
		/*
	 	5000원 -> 10회	 	
	 	10회 --> 게임 수행	 	
	 	잔여횟수만큼 반복~ 1~6 뽑아~	 	
	 	1 4 5 1 3 4 5 6 6 1
	 	
	 	성공 횟수 : 
	 	실패 횟수 :	 	
	 	성공 종합 점수 :
	 	
	 	출력 결과 보여주고 리 게임 스타트 매출액 제외( 초기화 )
	 	
	 	성공 횟수 : 0
	 	실패 횟수 : 0	 	
	 	성공 종합 점수 : 0	 	
		 */
		
		/*
		 while(마감을 선택할때까지) {
		 
		 }
		 
		 while(true) {
		 메뉴입력( 1. 충전, 2. 게임시작 3. 마감)
		 
		 1. 충전선택시?
		 	-> 로직코드
		 2. 게임시작선택시?
		 	-> 로직코드
		 3. 마감선택시?
		 	Break;
		 */
	
		
	}

}
