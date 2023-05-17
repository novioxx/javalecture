package codingTest_230513;

import java.util.HashMap;
import java.util.Map;
//s에 담겨있는
public class Solution {
    public int solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        
       for(Map.Entry<String, Integer> entry : map.entrySet()) {
    	   //entryset을 통해 map에 입력된 문자열과 숫자를 순회하면서 String, Integer의 형태로 가져와 entry변수에 담음
    	   String word = entry.getKey(); 
    	   int num = entry.getValue();
    	   //s에 담겨있는 문자열중 word와 일치하는 문자열을 가져와 숫자로 변환
    	   s.replace(word, Integer.toString(num));
       }
        
        return Integer.parseInt(s);
    }
}
