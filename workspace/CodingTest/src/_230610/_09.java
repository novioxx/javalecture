package _230610;

import java.util.*;

public class _09 {
	// 최댓값 만들기
	// numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return
	public int solution(int[] numbers) {

		Arrays.sort(numbers);
		int num1 = numbers[0] * numbers[1];
		int num2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

		return num1 > num2 ? num1 : num2;
	}
}