package _230521;

public class _02 {
	// flag에 따라 다른 값 반환하기
	public int solution(int a, int b, boolean flag) {
		int answer = 0;

		if (flag == true) {
			answer = a + b;
		} else {
			answer = a - b;
		}

		return answer;
	}
}
