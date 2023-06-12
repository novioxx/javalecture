package _230612;

public class _02 {
	// 조건에 맞게 수열 변환하기 1
	// arr의 각 원소에 대해 값이 50보다 크거나 같은 짝수라면 2로 나누고, 50보다 작은 홀수라면 2를 곱한 값을 return
	public int[] solution(int[] arr) {
		int[] answer = new int[arr.length];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= 50 && arr[i] % 2 == 0) {
				answer[i] = arr[i] / 2;
			} else if (arr[i] < 50 && arr[i] % 2 != 0) {
				answer[i] = arr[i] * 2;
			}
		}

		return answer;
	}

}
