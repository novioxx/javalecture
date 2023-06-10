package _230610;

public class _03 {
	// 제곱수 판별하기
	// 매개변수 n이 제곱수라면 1, 아니면 2를 return
	//제곱근을 구하는 Math.sqrt을 사용해서 n의 제곱근을 변수에 담고, 제곱근을 담은 변수를 곱한 값이 n일 때 같으면 1,아니면 2
	public int solution(int n) {
		long sqrt = (long) Math.sqrt(n);
		long answer = 0;

		if (sqrt * sqrt == n) {
			answer = 1;
		} else
			answer = 2;

		return (int) answer;
	}

}
