package study.quiz퀴즈.q0513낮1;

public class ExcerciseInstanceof {
	
	/*
	 메서드명 : action
		기능 주어진 객체의 메서드를 호출한다 : .
		DanceRobot , dance() , 인 경우 를 호출하고
		SingRobot , sing() , 인 경우 을 호출하고
		DrawRobot , draw() . 인 경우 를 호출한다
		반환타입 없음 :
		매개변수: Robot r 인스턴스 또는 Robot 의 자손 인스턴스
	 */
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i< arr.length;i++)
		action(arr[i]);
		} // main
		}

		class Robot {}
		class DanceRobot extends Robot {
		void dance() {
		System.out.println("춤을 춥니다.");
		}
		}
		
		class SingRobot extends Robot {
		void sing() {
		System.out.println("노래를 합니다.");
		}
		}
		
		class DrawRobot extends Robot {
		void draw() {
		System.out.println("그림을 그립니다.");
		}

}
		/*
		  [실행결과]
		춤을 춥니다.
		노래를 합니다.
		그림을 그립니다.
		
				*/
