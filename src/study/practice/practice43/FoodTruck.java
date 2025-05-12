package study.practice.practice43;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {
	String truckBrandName; // 푸드트럭 브랜드명
	String owner; 	//푸드트럭 사장 네임
	List<Food> foodList;  //푸드트럭이 판매하는 메뉴 리스트
	
	int totalSales; //총 매출액
	boolean isOpened; //영업중 여부 true 열었다
	
	//일자별 매출이력 관리용 리스트
	List<SalesInfo> salesInfoList;
	
	public FoodTruck() {
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
		salesInfoList = new ArrayList<SalesInfo>();
	}
	public FoodTruck(String truckBrandName, String owner) {
		this.truckBrandName = truckBrandName;
		this.owner = owner;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}
	
	public void addMenu(Food food) {
		foodList.add(food);
	}
	public void addMenu(String name, int price) {
		foodList.add(new Food(name, price));
	}
	
	public void doSales() {	//푸드트럭 장사 메소드
		
		//전체 실행 로직 조율
		
		Scanner scanner = new Scanner(System.in);
		isOpened = true; //영업중 표시
		
		System.out.printf("===[%s %s 푸드트럭 영업시작]===\n", owner, truckBrandName);
		
		while(isOpened) {
			
			int menu = getMainMenu();
			
			switch (menu) {
			case 1:			//메뉴보기
				showFoodList(); //보유하고 있는 음식 리스트 메뉴로 보여주기
				break;
			case 2:			//주문하기				
				orderMenu();				 
				break;
			case 3:			//재고관리
				manageStock();				
				break;
			case 4:			//마감하기
				finishSales( );			
				break;
		
			}
		}
	}	
		//메인메뉴 번호선택 처리
		public int getMainMenu()	 {
			//1~4 번 정상 메뉴 입력 시에만 진행
			Scanner scanner = new Scanner(System.in);
			
			int menu = 0;
			
			while(true) {
				
				//시스템 메뉴 
				System.out.println();
				System.out.println("[메뉴선택]");
				System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
				System.out.println(">>>입력 : ");
				menu = scanner.nextInt()	;
				
				if(menu >= 1&& menu <=4) {
					break;
				}	 else {
					System.out.println("--> 잘못입력하셨습니다.");
					System.out.println("--> 보기 중에 선택하세요(1~4) \n");
				}
		}
			return menu;
		}
			
				public void showFoodList() {
					System.out.println();
					System.out.println("[---메뉴리스트---]");
					
					for(int i=0; i<foodList.size(); i++ ) {
						System.out.println((i+1)+ ". "+ foodList.get(i).getFoodInfo());
					}
					
				}
				
				public void orderMenu() {

					showFoodList();
					Scanner scanner = new Scanner(System.in);
					
					 System.out.print(">>> 주문 메뉴를 선택 : ");
					int order = scanner.nextInt();
					 
					 //order 메뉴 범위안데 있는가?
					 //System.out.println("주문한 메뉴 : "+ foodList.get(order-1).getFoodInfo());
					 
					 Food orderFood = foodList.get(order-1);
					 
					//재고가 없으면 주문 불가
					 if (orderFood.stock < 1) {
						 System.out.println("> 해당 메뉴는 품절입니다.");
						 return;
					 }
					 
					 
				    //주문하면 메뉴 금액만큼 매출 증가
					 totalSales += orderFood.price;
					 
				    //주문 갯수 만큼 재고 감소
					 //foodList.get(order-1)
					 orderFood.modifyStock(-1);	//재고 -1 조절
					 
					System.out.println(">>> 주문완료 : " + orderFood.name);
				}
				
				public void manageStock() {
					
					System.out.println("[---재고관리자---]");
					
					showFoodList();
					Scanner scanner = new Scanner(System.in);
										
					System.out.print(">>> 재고 관리할 메뉴를 선택 : ");
					int order = scanner.nextInt();
					
					System.out.println(">>> 재고 조정할 개수를 입력 : ");
					int changeStockCount = scanner.nextInt();
					
					Food stockFood = foodList.get(order-1);
					stockFood.modifyStock(changeStockCount);
					
					System.out.println(">>> 재고 조정 완료");
					System.out.println(stockFood.getFoodInfo());
					System.out.println("[--------------------------]");
				}
				
				public void finishSales() {
										
					int lossSales = 0; //폐기 등 손해금액
					for(Food food : foodList) {
						lossSales -= (food.price*0.3) * food.stock;
					}
					
					System.out.println("===[마감 정산 내역]===");
					System.out.println(">> 총 매출액 : " + totalSales);
					System.out.println(">> 폐기 손해 : " + lossSales);
					System.out.println(">> 최종 수익 : " + (totalSales-lossSales));
					
					SalesInfo si = new SalesInfo();
					si.totalSales = totalSales;
					si.lossSales = lossSales;
					si.income = (totalSales - lossSales);
					
					salesInfoList.add(si);
					
					isOpened = false;
					System.out.printf("===[%s %s 푸드트럭 영업종료]===\n", owner, truckBrandName);
				}
		
	
}
/*
푸드트럭
@- 푸드트럭은 여러종류의 음식들을 메뉴로 가지고 있을 수 있다.
@- 각 음식들은 각각의 이름, 가격, 재고를 가지고 있다.
@- 초기에 이름과 가격을 가지고 생성된다.
@ 각 음식별 재고를 설정할 수 있다.

- 메뉴를 보여주는 기능(메뉴와 함께 주문가능한 재고까지)이 있다.
- 메뉴중 주문을 할 수 있으며, 주문 시 금액만큼 매출이 증가하고 재고가 떨어진다.
- 재고가 없는 메뉴는 판매할 수 없다.

- 기능 기준 (메뉴보기, 주문하기, 재고관리(메뉴 재고 추가), 마감하기)

- 마감시 남은 재고만큼 매출액이 마이너스된다.
※마이너스 금액은 각 음식의 가격의 30% 원가
- 마감시 당일 매출액을 보여주고 종료됩니다.

김밥 1000 재고 50개
40개 -> 40,000원
10개 ->마감 -> 3000
매출 4만 - 폐기손해3천 최종수익 37000원
	
*/
