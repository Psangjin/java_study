package study.cls.cls01;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculator c1 = new Calculator();
		
		c1.brand = "카시오";		
		c1.powerOn();
		
		
		Calculator c2 = new Calculator( );
		
		c2.powerOn();
		
		c1. setBrightness(10);
		c2. setBrightness(3);
		
		//c2.getInfo();
		String s = c2.getInfo();
		System.out.println(s);
		
		System.out.println(c1.getInfo());
		
		int result = c2.sum(10,20);
		System.out.println(result);
		
		System.out.println(c2.sum(50, 80));
		
		int [ ] arr = {1,5,6,4,46,67};
		int result2 = 	c1.sumArr(arr);
		System.out.println(result2);
	}

}
