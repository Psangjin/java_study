package study.quiz퀴즈;

import java.util.Scanner;

public class q422아침 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//참조변수
		
		Scanner scanner = new Scanner(System.in);
		
		String str1 = "아침";
		String str2 = "아침";
		String str3 = scanner.nextLine();

		//참조변수에서 == 비교는 값 비교가 아니라 참조하는 주소가 같은지 비교 하는 것
		System.out.println(str1 == str2);	
		System.out.println(str1.equals(str2));
		System.out.println(str2 == str3);
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str2));
		
		//String 값을 비교할때는 equals 를 쓰자
	
		
		// null
		int num;
		int sum = 0;		// 0~100
		
		//num = num + 10;
		sum = sum + 10;
		
		//System.out.println(num);
		System.out.println(sum);
		
		String s1;
		String s2 = null;	//참조하는게 없다! = null
		String s3 = "글자";
		
		//System.out.println(s1);
		System.out.println(s2); //null
		System.out.println(s3);
		
		if(s2 != null)
			System.out.println(s2.equals("글자"));
	}

}