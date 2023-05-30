package _230530;

import java.util.Arrays;

public class _02 {
	// numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return
	public int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = {};

		answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
		return answer;
	}
}
