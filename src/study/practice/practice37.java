package study.practice;

import java.util.HashMap;
import java.util.HashSet;

public class practice37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String str = "Returns a completion of the value and message";
//
//		1. 이 문장에 사용된 알파벳의 갯수는 몇개인가요?
//		(중복된 수 제외, 대소문자 구분X)
//		Ex) R r 둘다 구분하지 않고 알파벳 r 한개라고 체크
//
//		2. 이 문장에 사용된 알파벳들이 각각 몇 글자씩 있는지 세어보고 출력하세요.
		
		// int n = 10;
		// 출력(n+1)
		// 출력 (n++)
		
		String str = "Returns a completion of the value and message";
		
		System.out.println(str.charAt(15));
		
		System.out.println(str.toLowerCase());
		
		str = str.toLowerCase()	;     //완전히 소문자로 변환
		
		for(int i= 0; i<str.length(); i++) {
			//str.charAt(i)	-> char ==  ' '
			// char -> String . equals
			if(str.charAt(i) != ' ')
				System.out.print(str.charAt(i));
		}System.out.println();
		
		System.out.println(str.replace(" ", "")); // 원본은 안바뀜
		
		for(int i= 0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}System.out.println();
		
		str = str.replace(" ", "");
		
		HashSet<Character> set = new HashSet<Character>();
		for(int i= 0; i<str.length(); i++) {
			set.add(str.charAt(i));
		}
		System.out.println("알파벳 종류의 수 :" + set.size());
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			
			char c = str.charAt(i);
			
			map.put(c, map.getOrDefault(c, 0)+1);
			
//			if(map.containsKey(c)) {
//				map.put(c, map.get(c) + 1);
//			}else {
//				map.put(c, 1);
//			}
			for(char key : map.keySet()) {
				System.out.println("알파벳: " + key + "갯수: ", map.get);
			}
		}
		
	}
	

}
