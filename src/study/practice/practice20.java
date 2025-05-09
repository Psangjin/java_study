package study.practice;

import java.util.Scanner;

public class practice20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	prac1 ();
		prac2 ();
	
	
	}
	
	
	public static void prac1() {

		Scanner scanner = new Scanner (System.in);
//		
//		String addOrder = "y";
//		
//		while ( !addOrder.equals("n") {
//			
//		}
		int menu1Count = 0; //각 메뉴 몇잔 시켰는지 갯수
		int menu2Count = 0;
		int menu3Count = 0;
		
		while (true) {
			
			System.out.println("========= 메뉴 =========");
//			System.out.println("1. 아메리카노    3500원");
//			System.out.println("2. 카페라떼     4100원");
//			System.out.println("3. 바닐라라떼    4300원");
			System.out.printf("1. %-8s   %-5d원\n", "아메리카노", 3500);
			System.out.printf("2. %-8s   %-5d원\n", "카페라떼", 4100);
			System.out.printf("3. %-8s   %-5d원\n", "바닐라라떼", 4300);			
			System.out.println("=======================");
			
			//메뉴 입력
			System.out.print("메뉴 선택 : ");
			int menu = scanner.nextInt();
			
			if (!(menu>=1 && menu <=3)) {
				System.out.println("잘못입력하셨습니다. 다시 입력하세요!!!");
				continue; // 이 코드 이후로 현재턴 실행 생략 -> 다음 턴
			}
			
			//수량 선택
			System.out.print("수량 선택 : ");
			int count = scanner.nextInt();
			
			//기록! 무슨 메뉴를 몇잔 시켰나?
			
			if(menu == 1)
				menu1Count = menu1Count + count;
			else if (menu == 2)
				menu2Count += count;
			else 
				menu3Count += count;
			
			scanner.nextLine()	; // clear
			
			while (true) {
			System.out.println("추가주문 하시겠습니까? (y/n) : ");
			String addOrder = scanner.nextLine();
			
			//y/n 정상입력 여부 체크
			if(!(addOrder.equals("y")|| addOrder.equals("n")) ){
				System.out.println("잘못입력하셨습니다. 다시 입력하세요!!!");
			}else { //정상입력!! y , n
				break;
			}
			
			if(addOrder.equals("n")) {
				// 최종 주문한 메뉴 목록 보여주고
				// 총금액이 얼마다~
				int total = 0;
				
				System.out.println("=========================");
				if (menu1Count > 0) {
					System.out.printf("아메리카노 %d잔 : %d원\n", menu1Count, menu1Count * 3500);
					total =total + menu1Count * 3500;
				}
				if (menu2Count > 0) {
					System.out.printf("아메리카노 %d잔 : %d원\n", menu2Count, menu2Count * 4100);
					total =total + menu1Count * 4100;
				}
				if (menu3Count > 0) {
					System.out.printf("아메리카노 %d잔 : %d원\n", menu3Count, menu3Count * 4300);
					total =total + menu1Count * 4300;
				}
				System.out.println("=========================");
				//System.out.printf("총액 : %d원", menu1Count * 3500 + menu2Count * 4100 + menu3Count* 4300);
				System.out.printf("총액 : %d원", total);
				break;
			}
			
			}
		}
	}


			
//			//정상 메뉴 선택 여부! 1,2,3
//			//if(menu == 1 || menu == 2 || menu ==3)
//			if(menu >= 1 && menu <=3) {
//				
//				//수량 선택
//				System.out.print("수량 선택 : ");
//				int count = scanner.nextInt();
//				
//				scanner.nextLine()	;
//				
//				System.out.println("추가주문 하시겠습니까? (y/n) : ");
//				String addOrder = scanner.nextLine();
//				if(addOrder.equals("n"))
//					break;
//			}else {
//				System.out.println("잘못입력하셨습니다. 다시 입력하세요!!!");
				
				
			
		
	


	public static void prac2() {
	
			String [] menuArr = {"아메리카노", "카페라떼", "바닐라라떼"};
			int [] priceArr = {3500, 4100, 4300};
			
			int [] countArr = new int [3];	// 0 초기화
			
			//menuArr [2]
			
			while (true) {
				
				System.out.println("========= 메뉴 =========");
				for(int i=0;	 i<menuArr.length;	i++	) {
					//i : 0 1 2
					//NO : 1 2 3
				
					System.out.printf("%d.%s  \t%d원\n", i+1, menuArr[i], priceArr[i]);
				}
			//						
				System.out.println("=======================");
				
				//메뉴 입력
				System.out.print("메뉴 선택 : ");
				int menu = scanner.nextInt();
				
				if (!(menu>=1 && menu <=menuArr.length)) { //정상범위가 아니면!
					System.out.println("잘못입력하셨습니다. 다시 입력하세요!!!");
					continue; // 이 코드 이후로 현재턴 실행 생략 -> 다음 턴
				}
				
				//수량 선택
				System.out.print("수량 선택 : ");
				int count = scanner.nextInt();
				
				countArr[menu-1] += count; // 모든 메뉴에 대해 수량 처리하는 코드가 공통 적용
				
				scanner.nextLine(); //clear
				
				String addOrder;                                         
				
				if(menu == 1)
					countArr [menu-1] += count;
				else if (menu == 2)
					countArr [menu-1] += count;
				else 
					countArr [menu-1] += count;
				
				scanner.nextLine()	; // clear
				
				while (true) {
					System.out.println("추가주문 하시겠습니까? (y/n) : ");
					String addOrder = scanner.nextLine();
					
					//y/n 정상입력 여부 체크
					if(!(addOrder.equals("y")|| addOrder.equals("n")) ){
						System.out.println("잘못입력하셨습니다. 다시 입력하세요!!!");
					}else { //정상입력!! y , n
						break;
					}
					
					if(addOrder.equals("n")) {
						// 최종 주문한 메뉴 목록 보여주고
						// 총금액이 얼마다~
						int total = 0;
						
						System.out.println("=========================");
						//munuArr
						//priceArr
						//countArr
						
						for(int i=0; i<menuArr.length; i++)	 {
							if(countArr[i]> 0) {
								System.out.printf("%-8s %d잔 : %d원\n", menuArr[i], countArr[i], countArr[i]*priceArr[i]);
								total = total + (countArr[i]*priceArr[i]);
							}
						
						}
						System.out.println("=========================");
						//System.out.printf("총액 : %d원", menu1Count * 3500 + menu2Count * 4100 + menu3Count* 4300);
						System.out.printf("총액 : %d원", total);
						break;
					}
	}
}
