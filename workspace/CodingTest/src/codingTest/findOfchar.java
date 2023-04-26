package codingTest;

import java.util.HashMap;
import java.util.Map;

public class findOfchar {

	 public int[] solution(String s) {
	        int[] answer = new int[s.length()];

	        Map<Character, Integer> map = new HashMap<>();
	        for (int i = 0; i < s.length(); i++) {
	            if (!map.containsKey(s.charAt(i))) { //입력한 문자가 문자열에 없을 때
	                answer[i] = -1;
	                map.put(s.charAt(i), i++);
	            } else {
	                int end = map.get(s.charAt(i)); //입력한 문자가 기존 인덱스에 있을 때 값을 담을 변수 선언
	                answer[i] = i - end; // 기존 인덱스에서 마지막 인덱스 빼기
	                map.put(s.charAt(i), i); 
	            }

	        }
	        return answer;
	    }
	}
