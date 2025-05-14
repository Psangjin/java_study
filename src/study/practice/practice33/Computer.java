package study.practice.practice33;

public class Computer {

	public final String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
	public int osIndex;
	public int memory;
	
	public Computer(int osIndex, int memory) {
		this.osIndex = osIndex;
		this.memory = memory;
	}
	
	public void print( ) {
		System.out.printf("운영체제: %s, 메인메모리: %d \n", osType[osIndex], memory);
	}
}
