package _230605;

import java.util.Arrays;

public class _04 {
	//중앙값 구하기
	//배열의 중간값 구하기
	public int solution(int[] array) {
		int answer = 0;

		Arrays.sort(array);

		answer = array[array.length / 2];

		return answer;
	}
}

