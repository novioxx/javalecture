package _230612;

import java.util.*;

public class _05 {
	// 뒤에서 5등 위로
	// num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트
	public List solution(int[] num_list) {
		List<Integer> list = new ArrayList<>();

		Arrays.sort(num_list);

		for (int i = 5; i < num_list.length; i++) {
			list.add(num_list[i]);
		}
		return list;
	}
}