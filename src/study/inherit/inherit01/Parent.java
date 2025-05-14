package study.inherit.inherit01;

public class Parent {

	int money;
	
//	public parent() {
//		System.out.println("Parent() 생성자");
//	}
	
	public Parent(int money) {
		this.money = money ;
	}
	
	public void say() {
		System.out.println("부모님 말씀");
	}
}
