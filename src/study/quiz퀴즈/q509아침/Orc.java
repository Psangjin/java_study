package study.quiz퀴즈.q509아침;

public class  Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
	this.name = name;
	this.hp = hp;
	}

	public String toString() {
		String str = String.format("name: %s, hp: %d", name, hp );
	return str;
	}
	

}
