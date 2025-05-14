package study.practice.practice45;

public class  ExcerciseInstanceof {
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		for(int i=0; i< arr.length;i++)
		action(arr[i]);
		} // main
		public static void action(Robot r) {
			if(r instanceof DanceRobot) {
				DanceRobot dr = (DanceRobot)r;
				dr.dance();
			}
			if(r instanceof SingRobot) {
				SingRobot sb = (SingRobot)r;
				sb.sing();
			}
			if(r instanceof DrawRobot) {
				DrawRobot db = (DrawRobot)r;
				db.draw();
			}
		}
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