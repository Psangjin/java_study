package study.cls.cls01;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//자바 -> Run -> main 을 찾아서 실행
		
		//정수형 타입 변수
		int a = 10;
		
		// 정수형 배열 변수 ( 참조타입 = 주소저장 )
		int[]arr =new int[5];
		
		//클래스타입 변수( 참조타입 = 주소를 저장)
		Student stu1 = null;
		stu1 = new Student() ;
		
		Student stu2 = new Student();
		
		System.out.println(stu1.name);
		
		System.out.println(stu2.age);
		
		stu1.name = "가이름";
			stu1.age = 19;
			stu1.grade = 3;
	
		stu2.name = "나이름";
			stu2.age = 15;
			stu2.grade = 2;
			
			System.out.println(stu1.name);
			
			System.out.println(stu2.age);
			
			Student stu3 = null;
			System.out.println(stu3);
			
			
			System.out.println(stu3.name);
	}
}
