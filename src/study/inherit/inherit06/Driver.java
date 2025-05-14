package study.inherit.inherit06;

public class Driver {
	public void drive(Bus bus) {
		System.out.println("Driver 운전 시작");
		bus.run() ;
	}
	public void drive(Taxi taxi) {
		System.out.println("Driver 운전 시작");  
		taxi.run();
	}
}
