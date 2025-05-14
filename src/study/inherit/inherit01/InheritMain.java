package study.inherit.inherit01;

public class InheritMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Parent p1 = new Parent();
		Parent p1 = new Parent(1000);
		p1.say();
		p1.money = 1000;
		
		
		Child c1 = new Child();
		c1.money = 2000;
		c1.say();
		
		Child c2 = new Child(5000);
		
	}

}
