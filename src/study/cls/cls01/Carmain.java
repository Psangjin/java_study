package study.cls.cls01;

public class Carmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car car1 = new Car();   //new 가 입력될 때 생성자가 호출된다(실행됨)
		Car car2 = new Car();
		Car car3 = new Car("흰색");
		
		System.out.println(car1.color);
		System.out.println(car3.color);
		
		Car car4 = new Car("검정");
		System.out.println(car4.color);
		
		Car car5= new Car("파랑", 10000000);
		System.out.println(car5.color);
		System.out.println(car5.price);
		
		car5.color = "노랑";
		car5.model = "모닝";
		System.out.println(car5.model);
		System.out.println(car5.color);
		System.out.println(car5.price);
		
		Car car6 = new Car("소나타", 2500000);
		System.out.println(car6.color);
	}

}
