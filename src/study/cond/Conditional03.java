package study.cond;

public class Conditional03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// 조건문 swich문
				// 같은 값만 비교 가능
		// 해당 되는 값의 아래에 있는 값들이 모두 출력  멈추고 싶으면 break; 
		int dice = 4;
		
		
		
		
		switch (dice)	{
		case 1:
			System.out.println("1이다");
			break;
		case 2:
			System.out.println("2이다");
			break;
		case 99:
			System.out.println("99이다");
			break;
		default:
			System.out.println("default 다");
			
		}
		
		
		dice= 99;
		switch (dice)	{
		case 1 ->	System.out.println("1이다");
		//	break;
		case 2 ->	System.out.println("2이다");
		//	break;
		case 99 ->	System.out.println("99이다");
		//	break;
		default ->	System.out.println("default 다");
			
		}
		
		//switch 실수형(double) nono 안됨~
		char c = 'c';
		
		switch (c) {
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		default:
		}
		
		String day = "FRI";
		
		switch(day) {
		case "MON":
		case "TUE":
		case "FRI":
			System.out.println("금요일입니다.");
			break;
	//	default;
		}
		
	}

}
