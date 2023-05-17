package codingTest_230513;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class _string_eng {
	public int solution(String s) {
		int answer = 0;

		Map<String, Integer> map = new HashMap<>();
		map.put("zero", 0);
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("nine", 9);

//		
//		map("^(one|two|three|four|five|six|seven|eight|nine)$", 
//				1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9);

// 맵을 이용해서 키의 값을 통해 숫자를 찾으려고 하니 기대값이 0으로 되서 케이스를 통과못함	        

		for (String word : map.keySet()) {
			s = s.replaceAll(word, map.get(word).toString());
		}

		return Integer.parseInt(s);
		
	}
}
