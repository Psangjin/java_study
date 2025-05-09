package study.quiz퀴즈;

import java.util.Scanner;

public class q425아침2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		
//		엘리베이터
//		
//		스마트 엘리베이터 시스템을 제작하려고 합니다.
//		해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
//		해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
//		(반복문, 조건문, 배열, 메소드를 최대한 사용하시면 됩니다. )
//		
//		- 기본 문제
//		1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
//		(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
//		엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
//		엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
//		참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다. (오로지 한번에 100층까지 쭉)
//		
//		+ 탑승 인원을 입력받습니다.
//		+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.
//				
		//basicV1 () ;
		//basicV2 () ;
		//basicV3 () ;
		//level1() ;
		//level11 () ;
		level22 () ;
	}
			
		
		public static void basicV1( ) {
			
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("탑승 인원 수 입력 : ");
			int presonCount = scanner.nextInt()	;
			
			int [] destFloorArr= new int[presonCount];
			
			System.out.print("목적지 층수 입력(2~100) : ");
			for(int i=0; i<destFloorArr.length; i++) {
				destFloorArr[i] = scanner.nextInt()	;
				
			}
			
			
			
			// 1층 ~100층 -> 목적지 층 멈추기
			
			for (int i=1; i<=100 ; i++ ) {
				System.out.println(i+ "층");
				
				//내리는 층인지 확인
					for (int j=0; j<destFloorArr.length; j++) {
						if(i == destFloorArr[j]) {
							System.out.println("****도착****");
					}
				}
			}
			
			// 100층 ->1층
			for (int i=100; i>=1 ; i-- ) {
				System.out.println(i+ "층");
			}
			
		}
		
		public static void basicV2( ) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("탑승 인원 수 입력 : ");
			int presonCount = scanner.nextInt()	;
			
			int [] destFloorArr= new int[presonCount];
			
			System.out.print("목적지 층수 입력(2~100) : ");
			for(int i=0; i<destFloorArr.length; i++) {
				destFloorArr[i] = scanner.nextInt()	;
				
			}
			
			
			
			// 1층 ~100층 -> 목적지 층 멈추기
			
			int maxFloor = destFloorArr[0];
			for (int i=0; i<destFloorArr.length; i++ ) {
				if (maxFloor < destFloorArr[i] )
					maxFloor = destFloorArr[i] ;
				
			}
			
			System.out.println("=====올라갑니다======");
			for (int i=1; i <= maxFloor; i++ ) {
				System.out.println(i+ "층");
			
				//내리는 층인지 확인
			for (int j=0; j<destFloorArr.length; j++) {
						if(i == destFloorArr[j]) {
							System.out.println("****도착****");
					}
				}
			}
			
			// 100층 ->1층
			System.out.println("=====내려갑니다======");
			for (int i=maxFloor; i>=1 ; i-- ) {
				System.out.println(i+ "층");
			}
			
		}
		
		
		public static void basicV3( ) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("탑승 인원 수 입력 : ");
			int presonCount = scanner.nextInt()	;
			
			int [] destFloorArr= new int[presonCount];
			
			System.out.print("목적지 층수 입력(2~100) : ");
			for(int i=0; i<destFloorArr.length; i++) {
				destFloorArr[i] = scanner.nextInt()	;
				
			}
			
			
			
			System.out.println("최대 멈춤 횟수 입력 : ");
			int maxStopCount = scanner.nextInt() ;
			
			// 1층 ~100층 -> 목적지 층 멈추기
			
			int maxFloor = destFloorArr[0];
			for (int i=0; i<destFloorArr.length; i++ ) {
				if (maxFloor < destFloorArr[i] )
					maxFloor = destFloorArr[i] ;
				
			}
			
			int floor = 1;
			int flow = 1;		//flow : 1 -1
			int stopCount = 0;	//멈춘 횟수
			 	
			while(true) {
				
				System.out.println(floor + "층");
				
				
				if(flow ==1 ) {
					for (int j=0; j<destFloorArr.length; j++	) {
						if(floor == destFloorArr[j]) {
							System.out.println("*****도착*****");
							stopCount++;
						}
					}
				}
				
				if( stopCount == maxStopCount) {
					System.out.println("=========운영정지 (점검 중)===========");
					break;
				}
				
				
				
				if(floor >= maxFloor)
					flow = -1;
				
				if(floor <=1 && flow == -1)
					break;
				
			}
			
	
		
		
		}
		
		public static void level1 ( ) {

			Scanner scanner = new Scanner(System.in);
			
			System.out.print("탑승 인원 수 입력 : ");
			int presonCount = scanner.nextInt()	;
			
			int [] destFloorArr= new int[presonCount];
			
			System.out.print("목적지 층수 입력(2~100) : ");
			for(int i=0; i<destFloorArr.length; i++) {
				destFloorArr[i] = scanner.nextInt()	;
				
			}
			
			
			
			// 1층 ~100층 -> 목적지 층 멈추기
			
			for (int i=1; i<=100 ; i++ ) {
				System.out.println(i+ "층");
				
				//내리는 층인지 확인
					for (int j=0; j<destFloorArr.length; j++) {
						if(i == destFloorArr[j]) {
							System.out.println("****도착****");
					}
				}
			}
			
			// 100층 ->1층
			for (int i=100; i>=1 ; i-- ) {
				System.out.println(i+ "층");
			}
		}
//		
//		- 레벨 1
//		부실 공사로 인한 전기 공급의 한계로, 엘리베이터가 멈출 수 있는 횟수에 제한이 생깁니다.
//		엘리베이터는 마지막 횟수가 되면, 남아 있는 사람들은 계단으로 보내며
//		(마지막 횟수가 3일 때, 사람들의 내릴 층이 2, 3, 4, 5층이라면 4층에서 멈추어야 함)
//		현재 층 수에 점검 중 표시를 하고 운영을 멈춥니다.
//
//		+ 엘리베이터가 멈출 수 있는 최대 횟수는 사용자 입력을 받습니다
		
		
		public static void level11() {
			
			/*
			- 레벨 1
			부실 공사로 인한 전기 공급의 한계로, 엘리베이터가 멈출 수 있는 횟수에 제한이 생깁니다.
			엘리베이터는 마지막 횟수가 되면, 남아 있는 사람들은 계단으로 보내며
			(마지막 횟수가 3일 때, 사람들의 내릴 층이 2, 3, 4, 5층이라면 4층에서 멈추어야 함)
			현재 층 수에 점검 중 표시를 하고 운영을 멈춥니다.
			
			+ 엘리베이터가 멈출 수 있는 최대 횟수는 사용자 입력을 받습니다.
			*/
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("탑승 인원 수 입력 : ");
			int personCount = scanner.nextInt();
			
			int[] destFloorArr = new int[personCount];
			
			System.out.print("목적지 층수 입력(2~100) : ");
			for(int i=0; i<destFloorArr.length; i++) {
				destFloorArr[i] = scanner.nextInt();
				//입력한 값이 2~100 이 아니면? -> 다시 입력해라
			}
			
			System.out.print("최대 멈춤 횟수 입력 : ");
			int maxStopCount = scanner.nextInt();
			
			
			System.out.print("최대정원: ");
			int maxCount = scanner.nextInt();
			
			System.out.print("최대무게 : ");
			int maxweith = scanner.nextInt();
			
			
			// 1층 ~ 100층 -> 목적지 층수에 멈추기
			// v2 : 입력층 중에서 최대층까지만 가고 내려오기
			
			// 입력 층 중에서 최대값 구하기
			int maxFloor = destFloorArr[0];
			for(int i=0; i<destFloorArr.length; i++) {
				if(maxFloor < destFloorArr[i])
					maxFloor = destFloorArr[i];
			}
			
			int floor = 1;
			int flow = 1;	//flow: 1 -1   층의 진행 방향을 의미, 층 값 변화 연산에 참여
			int stopCount = 0; //멈춘 횟수
			//도착 층 표시
			//1~100층 -> 100층 -> 1층
			//1~최대층 -> 최대층 -> 1층
			while(true) {
				
				System.out.println(floor + "층");	
				
				//내리는 층인지 확인
				if(flow == 1) {
					for(int j=0; j<destFloorArr.length; j++) {
						if(floor == destFloorArr[j]) {
							System.out.println("****도착****");
							stopCount++;
						}
					}
				}
				
				if(stopCount == maxStopCount) {	//멈춘횟수 다 씀
					System.out.println("====운영중지 (점검 중)====");
					break;
				}
				
				//100층까지 다 올라갔으면? 내려가는 방향으로 설정
				//if(floor >= 100)
				if(floor >= maxFloor)
					flow = -1;
				
				if(floor <= 1 && flow == -1)
					break;
				
				//isUp 값에 의해 +1 -1 결정
				floor += flow;
			}
		}
		
		
		public static void level22() {
			
//			- 레벨 2
//			엘리베이터는 태울 수 있는 총 중량 또는 정원이 있습니다.
//			탑승 인원을 순서대로 측정하되, 총 무게를 넘거나 정원이 넘으면 그 뒤에 인원을 엘리베이터에 태우지 않습니다.
//			(총 중량이 200kg 일 경우, 탑승 인원 순서대로 80, 120, 40 이면 가장 마지막 사람은 태우지 않음)
//
//			+ 엘리베이터의 총 무게 및 정원은 사용자 입력을 받습니다.
//			+ 탑승 인원 및 각 탑승 인원의 내릴 층은 랜덤으로 추출합니다. (사용자 입력에서 변경)
//			+ 각 탑승 인원의 무게도 랜덤으로 추출합니다. (40 kg ~ 150 kg)
			
			Scanner scanner = new Scanner(System.in);

			
			
			//탑승인원 랜덤 // 1~20 대기 가정
			int personCount = (int) (Math.random()* 20) +1;
			System.out.println("탑승인원 : "+ personCount);
			
			int[] destFloorArr = new int[personCount];
			
						
			//System.out.print("목적지 층수 입력(2~100) : ");
			System.out.print("목적지 층수 목록(2~100) : ");
			for(int i=0; i<destFloorArr.length; i++) {
				//destFloorArr[i] = scanner.nextInt();
				//입력한 값이 2~100 이 아니면? -> 다시 입력해라
				
				//층수 랜덤 처리하라.
				destFloorArr[i] = (int)(Math.random()* 99	 ) +2;	 // 2~100
				System.out.print(destFloorArr[i]+" ");
			}
			System.out.println();
			
			int[] weightArr = new int[personCount];
			System.out.print("탑승객 몸무게 목록(40~150) : ");
			for (int i=0; i<weightArr.length; i++) {
					weightArr[i] = (int) (Math.random()*111)+40; // 40~150
					System.out.print(weightArr[i]+" ");
			}
			System.out.println();
			
			System.out.print("최대 멈춤 횟수 입력 : ");
			int maxStopCount = scanner.nextInt();
			
			System.out.print("엘리베이터 총 무게(kg)입력 : ");
			int maxWeight = scanner.nextInt()	;
			System.out.print("엘리베이터 탑승 정원 입력 : ");
			int maxPersonCount = scanner.nextInt()	;
			
//			
//			System.out.print("최대정원: ");
//			int maxCount = scanner.nextInt();
//			
//			System.out.print("최대무게 : ");
//			int maxweith = scanner.nextInt();
			
			
			// 1층 ~ 100층 -> 목적지 층수에 멈추기
			// v2 : 입력층 중에서 최대층까지만 가고 내려오기
			
			
			
			//실제 탑승 인원 수
			// 1) 탑승 정원 만큼
			// 2) 탑승객의 무게 합상 <= 엘리베이터 총 무게
			int sumWeight =0;
			int realPersonCount = 0;
			
//			for(int i=0; i<weightArr.length; i++ ) {
//				//변수명 제대로 작성하기. 나중에 봐도 알아볼 수 있게
//				
//				//최대인원을 넘는가?
//				if(i >= maxPersonCount) {
//					realPersonCount = i;
//					break;
//				}
//				
//				
//				//최대무게를 넘는가?
//				if( sumWeight + weightArr[i] >maxWeight ) {
//					realPersonCount = i;
//					
//					break;
//				}else {
//					sumWeight = sumWeight + weightArr[i]; 
//				}
//			}
			
			// 탑승정원 -? 무게 순으로 필터
//			
//			int iMaxCount = (weightArr.length > maxPersonCount ? maxPersonCount :weightArr.length;
//			if(weightArr.length > maxPersonCount) {
//				for (int i=0; i<maxPersonCount; i++) {
//					//제한사항 필터
//					sumWeight = sumWeight + weightArr[i];
//					if ( sumWeight > maxWeight) 
//						break;
//						
//						realPersonCount++;
//					}
//			
			
			
			
			//무게 먼저 필터 -> 탑승정원 적용
			for (int i=0; i<weightArr.length; i++) {
				
				sumWeight= sumWeight + weightArr[i];
				
				if ( sumWeight > maxWeight) 
					break;
					
					realPersonCount++;
				}
			
								
			realPersonCount = (realPersonCount > maxPersonCount) ? maxPersonCount : realPersonCount;
			
			System.out.println("최종 탑승 인원 : "+realPersonCount);
			
			
			
			//--------------------------------------------------------
			//(1) 실제 탑승 인원 -> 적용
			//(2) destFloorArr 실제 작동될 범위로 새로 지정
			
			
			// 입력 층 중에서 최대값 구하기
			int maxFloor = destFloorArr[0];
			for(int i=0; i<realPersonCount; i++) {
				if(maxFloor < destFloorArr[i])
					maxFloor = destFloorArr[i];
			}
			
			int floor = 1;
			int flow = 1;	//flow: 1 -1   층의 진행 방향을 의미, 층 값 변화 연산에 참여
			int stopCount = 0; //멈춘 횟수
			//도착 층 표시
			//1~100층 -> 100층 -> 1층
			//1~최대층 -> 최대층 -> 1층
			
			if (realPersonCount > 0) {
			while(true) {
				
				if(realPersonCount <1 ) {
					System.out.println("=====탑승인원이 없습니다=====");
					break;
				}
							
				System.out.println(floor + "층");	
				
				//내리는 층인지 확인
				if(flow == 1) {
					for(int j=0; j<destFloorArr.length; j++) {
						if(floor == destFloorArr[j]) {
							System.out.println("****도착****");
							stopCount++;
						}
					}
				}
				
				if(stopCount == maxStopCount) {	//멈춘횟수 다 씀
					System.out.println("====운영중지 (점검 중)====");
					break;
				}
				
				//100층까지 다 올라갔으면? 내려가는 방향으로 설정
				//if(floor >= 100)
				if(floor >= maxFloor)
					flow = -1;
				
				if(floor <= 1 && flow == -1)
					break;
				
				//isUp 값에 의해 +1 -1 결정
				floor += flow;
			
		}
}
}
		
