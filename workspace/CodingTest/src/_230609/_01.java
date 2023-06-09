package _230609;

import java.util.ArrayList;
import java.util.List;

public class _01 {
	// n번째 원소까지
	// 첫번쨰 원소부터 n번째 원소까지 return
	public int[] solution(int[] num_list, int n) {
		int[] answer = new int[n];

		for (int i = 0; i < n; i++) {
			answer[i] = num_list[i];
		}

		return answer;
	}
}
