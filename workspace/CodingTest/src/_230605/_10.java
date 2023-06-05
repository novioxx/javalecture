package _230605;

public class _10 {
	// 숨어있는 숫자의 덧셈 (1)
	// 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return
	public int solution(String my_string) {
		int answer = 0;
		String[] arr = my_string.replaceAll("[a-zA-Z]", "").split("");

		for (String num : arr) {
			answer += Integer.parseInt(num);
		}

		return answer;
	}
}
