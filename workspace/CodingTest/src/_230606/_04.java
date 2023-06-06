package _230606;

public class _04 {
	// 조건에 맞게 수열 변환하기 3
	// 만약 k가 홀수라면 k를 곱하고, k가 짝수라면 k를 더합니다.
	public int[] solution(int[] arr, int k) {
		int[] answer = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (k % 2 == 0) {
				answer[i] = arr[i] + k;
			} else {
				answer[i] = arr[i] * k;
			}
		}

		return answer;
	}
}