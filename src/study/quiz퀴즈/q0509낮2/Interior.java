package study.quiz퀴즈.q0509낮2;

public class Interior {

	public static void main(String[] args) {
		// 객체 생성 및 초기화 - 주방공간
		Kitchin k = new Kitchin();
		k.round = 35;
		k.wallcolor = "blue";
		k.height = 4;
		
		// 객체 생성 및 초기화 - 냉장고
		Fridge fr = new Fridge();
		fr.brand = "삼성";
		fr.litter = 150;
		fr.power = true;
		fr.attemperation = true;
		fr.door = 2;
		
		// 객체 생성 및 초기화 - 냉동실안에 얼음 트레이
		Fridgetray ft = new Fridgetray();
		ft.num = 12;
		ft.price = 25000;
		
		// 객체 생성 및 초기화 - 가스렌지
		Gasrange g = new Gasrange();
		g.fireball = 3;
		g.brand = "LG";
		g.price = 150000;
		g.fireon = "on";
		g.fireoff = "off";
		g.firecontrol = "control";
		
		// 객체 생성 및 초기화 - 싱크대
		Thingk t = new Thingk();
		t.width =
		t.length =		
		t.height =
		
		t.color = white;
		t.quality = stainless;
		
//		// 객체 생성 및 초기화 - 쓰레기통
//		Garbage gb = new Garbage();
//		gb.liter = 50;
//		gb.color = "blue";
//		gb.persent = 50;
//		gb.full = 
//		gb.open = 
//		gb.close = 
//		gb.drain = 
//		
//		// 객체 생성 및 초기화 - 컵
//		Cup c = new Cup();
//		c.volume = 250;
//		c.quality = "glass";
//		c.color = white;
		
		// 주방공간
		System.out.println("주방공간");
		k.explanation() ;
		System.out.println();
		// 냉장고
		System.out.println("냉장고");
		fr.explanation();
		System.out.println();
		// 냉동실안에 얼음 트레이
		System.out.println("냉동실안에 얼음 트레이");
		ft.explanation();
		System.out.println();
		//가스렌지
		System.out.println("가스렌지");
		g.explanation();
		System.out.println();
		//싱크대
		System.out.println("싱크대");
		t.explanation();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
	}}
