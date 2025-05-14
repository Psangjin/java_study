package study.practice.practice36;

import java.util.HashMap;

public class Solution {
	
	    public int solution(int[] array) {
	    	
	    	HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
	    	
	    	for(int n: array) {
	    		
	    		//map 에 해당 값이 key 있나?
	    		if(map.containsKey(n)) {
	    			// 있으면? 기존 카운트 + 1
	    			
	    			//map.get(n) 기존 n이라는 숫자(key)에 대한 카운트 값 => value
	    			int newCount = map.get(n) + 1;
	    			map.put(n, newCount);
	    			
	    		} else {
	    		// 없으면? 새로 추가, 카운트 1
	    			map.put(n, 1);
	    		}
	    	}
	        for(int key : map.keySet() ) {
	        	System.out.printf("key:%d value: %d\n", key, map.get(key));
	        }
	        
	    	return 0;
	    }
	    
	   
}
