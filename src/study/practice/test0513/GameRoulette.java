package study.practice.test0513;

import java.util.Scanner;

public class GameRoulette {

	String gameid; //게임 아이디
	String brandname; //지점명
	
	int totalSales; //총 매출액
	boolean isplay; //게임 시작
	
	public GameRoulette() {
		totalSales = 0;
		isplay = false;
	}
//	public GameRoulette(String gamid, String brandname) {
//		this.gameid = gameid;
//		this.brandname = brandname;
//		totalSales = 0;
//		isplay = false;
//	}
	
	
	


	public void gameplay() { // 게임 플레이 
		
		Scanner scanner = new Scanner(System.in);
		isplay = true;	//게임 시작
		
		System.out.println("===[ 룰렛 게임 ]===\n" );
		
		while(isplay) {
			int menu = MainList() ;
			
			switch (menu) {
			case 1:			//충전
				recharge();
				break;
			case 2:			//게임시작
				gamestart();
				break;
			case 3:			//마감
				finish();
				break;
				
			}
		}
	}public int MainList() {
		
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		
		while(true) {
			System.out.println();
			System.out.println("[메뉴선택]");
			System.out.println("1.충전 2.게임시작 3.마감");
			System.out.println(">>>입력 : ");
			menu = scanner.nextInt()	;
			
			if(menu >= 1&& menu <=3) {
				break;
			}	 else {
				System.out.println("--> 잘못입력하셨습니다.");
				System.out.println("--> 보기 중에 선택하세요(1~3) \n");
			}
		}
			return menu;
	
		}
		//충전
		public void recharge() {
			System.out.println("[---충전---]");
			
			
	}	//게임시작
		public int gamestart() {

			
			Scanner scanner = new Scanner(System.in);
						
			int result = (int)(Math.random()*6)+1;
			if(result >=1 && result <=4) {
				return result;
			}else {
				return 0;
			}
			
		}
		
	
		
		public void finish() {
			
			isplay = false;
			System.out.println("===[게임 종료]===");
			
		}
}