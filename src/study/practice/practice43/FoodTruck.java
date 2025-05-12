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
	
	public FoodTruck() {
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
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
			
			//시스템 메뉴 
			System.out.println();
			System.out.println("[메뉴선택]");
			System.out.println("1.메뉴보기 2.주문하기 3.재고관리 4.마감하기");
			System.out.println(">>>입력 : ");
			int menu = scanner.nextInt();
			int order;
			
			switch (menu) {
			case 1:			//메뉴보기
				//보유하고 있는 음식 리스트 메뉴로 보여주기
				System.out.println();
				System.out.println("[---메뉴리스트---]");
				 for(Food f: foodList) {
					 System.out.println(f.getFoodInfo());
				 }
				break;
			case 2:			//주문하기
				System.out.println();
				System.out.println("[---메뉴리스트---]");
				 //for(Food f: foodList) {
				
				// foodList.get(1).stock = 0; 	//재고 0 만들어보기 테스트
				
				 for(int i=0; i<foodList.size(); i++) {
				//	if(foodList.get(i).stock > 0)
					System.out.println((i+1)+ ". "+ foodList.get(i).getFoodInfo());

				 }
				 
				 System.out.print(">>> 주문 메뉴를 선택 : ");
				 int order = scanner.nextInt();
				 
				 //order 메뉴 범위안데 있는가?
				 //System.out.println("주문한 메뉴 : "+ foodList.get(order-1).getFoodInfo());
				 
				 Food orderFood = foodList.get(order-1);
				 
				//재고가 없으면 주문 불가
				 if (orderFood.stock < 1) {
					 System.out.println("> 해당 메뉴는 품절입니다.");
					 break;
				 }
				 
				 
			    //주문하면 메뉴 금액만큼 매출 증가
				 totalSales += orderFood.price;
				 
			    //주문 갯수 만큼 재고 감소
				 //foodList.get(order-1)
				 orderFood.modifyStock(-1);	//재고 -1 조절
				 
				System.out.println(">>> 주문완료 : " + orderFood.name);
				 
				break;
			case 3:			//재고관리
				System.out.println("[---재고관리자---]");
				System.out.println("[---메뉴리스트---]");
				
				for(int i=0; i<foodList.size(); i++ ) {
					System.out.println((i+1)+ ". "+ foodList.get(i).getFoodInfo());
				}
				
				System.out.print(">>> 재고 관리할 메뉴를 선택 : ");
				order = scanner.nextInt();
				
				System.out.println(">>> 재고 조정할 개수를 입력 : ");
				int changeStockCount = scanner.nextInt();
				
				Food stockFood = foodList.get(order-1);
				stockFood.modifyStock(changeStockCount);
				System.out.println(">>> 재고 조정 완료");
				System.out.println(stockFood.getFoodInfo());
				System.out.println("[--------------------------]");
				
				break;
			case 4:			//마감하기
				
				//마감처리
				//마감시 남은 재고만큼 매출액이 마이너스된다.
				//마감시 당일 매출액을 보여주고 종료합니다.
				
				int lossSales = 0; //폐기 등 손해금액
				for(Food food : foodList) {
					lossSales -= (food.price*0.3) * food.stock;
				}
				
				System.out.println("===[마감 정산 내역]===");
				System.out.println(">> 총 매출액 : " + totalSales);
				System.out.println(">> 폐기 손해 : " + lossSales);
				System.out.println(">> 최종 수익 : " + (totalSales-lossSales));
				
				isOpened = false;
				System.out.printf("===[%s %s 푸드트럭 영업종료]===\n", owner, truckBrandName);
				break;
			default:
				System.out.println("- -> 잘못입력하셨습니다.\n");
			}
		}
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
