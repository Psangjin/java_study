package study.quiz퀴즈;

import java.util.Scanner;

public class q423오후 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("======== 메뉴 ========");
		System.out.println("1. 아메리카노    3500원");
		System.out.println("2. 카페라떼     4100원");
		System.out.println("3. 바닐라라떼    4300원");
		System.out.println("=====================");
		
		Scanner scanner = new Scanner (System.in);

		System.out.print("메뉴 선택 : ");
		int menu = scanner.nextInt();
		System.out.print("수량 선택 : ");
		int count = scanner.nextInt();
		System.out.print("추가 주문하시겠습니까?(y/n) : ");
		String add = scanner.nextLine();
		
		if ( menu >=1 && menu <=3 ) {
					
		}else {
			System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
			System.out.println(scanner);
		}
		
	}

}
