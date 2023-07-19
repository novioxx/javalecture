package _230719;

import java.util.*;

//배열의 원소만큼 추가하기
public class _02 {
	public List solution(int[] arr) {
		List<Integer> answer = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				answer.add(arr[i]);
			}
		}

		return answer;
	}

}
