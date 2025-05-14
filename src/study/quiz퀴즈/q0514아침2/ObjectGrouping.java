package study.quiz퀴즈.q0514아침2;

public class ObjectGrouping {
	public static void main(String[] args) {
		// 다양한 객체 생성
		Bird bird = new Bird();
		Helicopter copter = new Helicopter();
		Rocket rocket = new Rocket();

		// 인터페이스 타입으로 그룹화
		Flyable[] flyableThings = { bird, copter, rocket };

		// 모든 날것들을 날림
		for (int i = 0; i < flyableThings.length; i++) {
		Flyable temp = flyableThings[i];
		temp.fly();
		}
		}
		}

		interface Flyable {
		public void fly();
		}

		class Bird implements Flyable {
		/* 1. fly() 메소드를 오버라이딩 하세요. */
			public void fly() {
				System.out.println("<새>가 날개를 퍼덕이며 날아갑니다.");
			}
		}

		class Helicopter implements Flyable {
		/* 2. fly() 메소드를 오버라이딩 하세요. */
			public void fly() {
				System.out.println("<헬기>가 프로펠러를 힘차게 돌리며 날아갑니다.");
			}
		}

		class Rocket implements Flyable {
		/* 3. fly() 메소드를 오버라이딩 하세요. */
			public void fly( ) {
				 System.out.println("<로켓>이 제트엔진을 분출하며 날아갑니다.");
			}
}
