package _230612;

public class _06 {
	// n보다 커질때까지 더하기
	// numbers의 원소를 앞에서부터 하나씩 더하다가 그 합이 n보다 커지는 순간 이때까지 더했던 원소들의 합을 return
	public int solution(int[] numbers, int n) {
		int answer = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (answer <= n) {
				answer += numbers[i];
			}
		}
		return answer;
	}
}
