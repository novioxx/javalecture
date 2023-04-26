package codingTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class union {
	public int[] solution(int[] arr) {
		int[] answer = new int[arr.length];

		List<Map> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			Map map = new HashMap<>();
			HashSet<Integer> hs = new HashSet<>();
			list.addAll(arr[i], list);

		}
		return answer;
	}
}
