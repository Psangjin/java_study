package retest;

import java.util.Scanner;

public class Roullet {

	// 아이디와 지점명
	
		public String machineId;
		public String brandName;
		public int allPoint;
		public int sucessCount;
		public int failCount;
		public int tryCount;
		public int totalPay;		
		

	// 생성자(아이디와 지점명)
		
		public Roullet ( String machineId, String brandName) {
			this.machineId = machineId;
			this.machineId = brandName;
			 allPoint = 0;
			 sucessCount = 0;
			 failCount = 0;
			 tryCount = 0;
			 totalPay = 0;
			}
	
	// 메소드

		public void selectMunu () {
			Scanner in = new Scanner(System.in);
			System.out.print("메뉴선택 1.충전 2.게임시작 3.마감");
			int Menu = in.nextInt();
		}
		
		
		public void gameStart() {
	    	System.out.println("===== 룰렛게임기 =====");
	    	
	        while (true) {
	            int Menu = selectMenu(); 
	            switch (inputMenu) {
                case 1: 
                       charge(); 
                    
                    break;
                case 2: 
                	playRoullet();
                    
                    break;
                case 3: 
                    
                    break; 
            }
        }

	        
	        System.out.println("=== 게임종료 ===");
	    
		 }
	}
		
}
