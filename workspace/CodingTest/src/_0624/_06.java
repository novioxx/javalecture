package _0624;

public class _06 {
	// 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return
	public int solution(int n) {
		int answer = 1;

		for (int i = 1; i <= n; i++)
			if (n % i == 0)
				answer++;

		return answer;
	}
}
