package _230521;

public class _10 {
	// 원소들의 곱과 합
	// 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다
	// 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
	public int solution(int[] num_list) {
		int answer = 0;
		int mul = 1;
		int sum = 0;

		for (int i : num_list) {
			mul *= i;
			sum += i;
		}

		answer = (mul < Math.pow(sum, 2)) ? 1 : 0;
		return answer;
	}
}
