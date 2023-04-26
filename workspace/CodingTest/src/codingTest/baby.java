package codingTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//문자열 순회시키고 중복제거하고 해당되는 문자열 체크해서 카운트 세기
public class baby {
	 public int solution(String[] babbling) {
	        int answer =0;
	        String[] str = {"aya", "ye", "woo", "ma"};		
	        int cnt = 0; //해당 문자열이 있을 떄 마다 담아줄 변수
	        
	        Map<Character, Integer> map = new HashMap<>();
	        while(true)
	        for (int i = 0; i < str.length; i++) {
	        	
	            if (!map.containsKey(babbling.length)) { 
	            	if(str.equals(i))
	                cnt++;
	            } else {
	            	
	            }

	            return answer;
	        }
	
	 }
}
