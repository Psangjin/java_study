package study.quiz퀴즈;

import java.util.Scanner;

public class q417아침 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//출생년도와 주민등록번호 뒷자리 첫번째 숫자를 입력받아서, 나이와 성별을 출력하세요.
		//기준은 2025년으로 함.
		//나이는 단순하게 2025년과의 차이로 함 (만 나이, 월 따지지 않음)
		//2000년생 = 26살
		//1996년생 = 30살

		//2000년생 이후로는 뒷자리 남자 : 3, 여자 : 4
		//2000년생 이전은 뒷자리 남자 : 1, 여자 : 2
		//그 외에 케이스가 들어오면 잘못된 입력이라고 출력하도록 처리.
		//어떤 경우가 잘못된 경우일지 한번 생각해보세요~

		//주민번호 뒷자리 첫번째 수 구분.
		//남자 : 1 이거나 3
		//여자 : 2 이거나 4

		Scanner scanner = new Scanner(System.in);
//		
		System.out.print("출생년도를 입력하세요 : ");
		int year = scanner.nextInt();
//				
//		//if (num1) =
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요 : ");
		int back = scanner.nextInt();
//		
		
		
		if(year == 2000) {
			if(back == 3) {
				System.out.println("결과 : 26살 남자입니다");
			}else if(back == 4) {
				System.out.println("결과 : 26살 여자입니다");
		}
		}else if(year == 1996) {
			if(back == 1) {
				System.out.println("결과 : 30살 남자입니다");
			}else if(back == 2) {
				System.out.println("결과 : 30살 여자입니다");			
		}
		}	if(year == 1995) {
			if(back == 1) {
				System.out.println("결과 : 31살 남자입니다");
			}else if(back == 2) {
				System.out.println("결과 : 31살 여자입니다");
		}
		}	if(year == 1997) {
			if(back == 1) {
				System.out.println("결과 : 29살 남자입니다");
			}else if(back == 2) {
				System.out.println("결과 : 29살 여자입니다");
		}
		}	if(year == 1998) {
			if(back == 1) {
				System.out.println("결과 : 28살 남자입니다");
			}else if(back == 2) {
				System.out.println("결과 : 28살 여자입니다");
		}
		
	//	System.out.println("결과 : %s %s \n", );
		
//		if (year) = {
				
		}
		
		//예시 1)
		//출생년도를 입력하세요 : 2000
		//주민번호 뒷자리 첫번째 숫자를 입력하세요 : 4
		//결과 : 26살 여자입니다.

		//예시 2)
		//출생년도를 입력하세요 : 1998
		//주민번호 뒷자리 첫번째 숫자를 입력하세요 : 1
		//결과 : 28살 남자입니다.
		
		
		
	
		}
	
}
