package study.quiz퀴즈.q509아침;

public class OrcWarrior extends Orc {
	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
	super(name, hp);
	this.amor = amor;
	}

	// 메소드 오버라이딩!
	public String toString() {
		String str = String.format("name: %s, hp: %d, amor: %d", name, hp, amor);
	return str;
	}

}
