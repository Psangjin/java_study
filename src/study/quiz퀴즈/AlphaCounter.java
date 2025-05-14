package study.quiz퀴즈;

import java.util.HashMap;
import java.util.Map;

public class AlphaCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		        String str = "Returns a completion of the value and message";

		        // 소문자로 변환하여 대소문자 구분 제거
		        str = str.toLowerCase();

		        // 알파벳별 개수 저장을 위한 HashMap
		        Map<Character, Integer> AlphaCounter = new HashMap<>();

		        for (char ch : str.toCharArray()) {
		            if (Character.isLetter(ch)) { // 알파벳인지 확인
		            	AlphaCounter.put(ch, AlphaCounter.getOrDefault(ch, 0) + 1);
		            }
		        }

		        // 1. 사용된 알파벳의 개수 (중복 제외)
		        System.out.println("1. 사용된 알파벳의 개수: " + AlphaCounter.size());

		        // 2. 각 알파벳별 개수 출력
		        System.out.println("2. 알파벳별 개수:");
		        for (Map.Entry<Character, Integer> entry : AlphaCounter.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		    }
		

	

}
