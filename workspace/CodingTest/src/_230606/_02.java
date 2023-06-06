package _230606;

import java.util.ArrayList;
import java.util.List;

public class _02 {
	// n개 간격의 원소들
	public List<Integer> solution(int[] num_list, int n) {

		List<Integer> answer = new ArrayList<>();

		for (int i = 0; i < num_list.length; i += n) {
			answer.add(num_list[i]);
		}
		return answer;
	}

}
