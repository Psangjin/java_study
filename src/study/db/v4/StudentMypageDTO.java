package study.db.v4;

import java.time.LocalDateTime;

import study.db.v3.ConvertDateUtil;

public class StudentMypageDTO {
	
	//Student
	int studno;
	String name;
	String id;
	int grade;
	String jumin;
	
	//LocalDateTime birthday;
	String birthday;
	String tel;
	int height;
	int weight;
	int deptno1; // 기본값 : 0  무조건 숫자다. 무조건 값을 가져야한다.
	//int deptno2; // 기본값:null, Nullable 값이 Null일수도 있다!
	Integer deptno2;
	//Integer -> int 타입의 Wrapper 클래스
	int profno;
	
	//Department
	int deptno;
	String dname;
	int part;
	String build;
	
	
	public int getStudno() {
		return studno;
	}
	public void setStudno(int studno) {
		this.studno = studno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getDeptno1() {
		return deptno1;
	}
	public void setDeptno1(int deptno1) {
		this.deptno1 = deptno1;
	}
	public Integer getDeptno2() {
		return deptno2;
	}
	public void setDeptno2(Integer deptno2) {
		this.deptno2 = deptno2;
	}
	public int getProfno() {
		return profno;
	}
	public void setProfno(int profno) {
		this.profno = profno;
	}
	
	
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getPart() {
		return part;
	}
	public void setPart(int part) {
		this.part = part;
	}
	public String getBuild() {
		return build;
	}
	public void setBuild(String build) {
		this.build = build;
	}
	
	@Override
	public String toString() {
		return "StudentMypageDTO [studno=" + studno + ", name=" + name + ", id=" + id + ", grade=" + grade + ", jumin="
				+ jumin + ", birthday=" + birthday + ", tel=" + tel + ", height=" + height + ", weight=" + weight
				+ ", deptno1=" + deptno1 + ", deptno2=" + deptno2 + ", profno=" + profno + ", deptno=" + deptno
				+ ", dname=" + dname + ", part=" + part + ", build=" + build + ", getStudno()=" + getStudno()
				+ ", getName()=" + getName() + ", getId()=" + getId() + ", getGrade()=" + getGrade() + ", getJumin()="
				+ getJumin() + ", getBirthday()=" + getBirthday() + ", getTel()=" + getTel() + ", getHeight()="
				+ getHeight() + ", getWeight()=" + getWeight() + ", getDeptno1()=" + getDeptno1() + ", getDeptno2()="
				+ getDeptno2() + ", getProfno()=" + getProfno() + ", getDeptno()=" + getDeptno() + ", getDname()="
				+ getDname() + ", getPart()=" + getPart() + ", getBuild()=" + getBuild() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
