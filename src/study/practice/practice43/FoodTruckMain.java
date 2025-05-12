package study.practice.practice43;

public class FoodTruckMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FoodTruck ft1 = new FoodTruck("오늘분식", "나오늘");
		
		Food food = new Food("김밥", 3000);
		ft1.addMenu(food);
		ft1.addMenu(new Food("떡볶이", 5000));
		ft1.addMenu("핫도그", 2000);
		
		ft1.doSales();
		
		/*
		FoodTruck ft2 = new FoodTruck("내일중식", "김중식");
		// 메뉴
		ft2.doSales();
		*/
		
	}

		
		
		
		
	}

