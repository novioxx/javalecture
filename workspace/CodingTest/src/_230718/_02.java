package _230718;

//문자열 곱하기
public class _02 {
	public String solution(String my_string, int k) {
		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < k; i++) {
			answer.append(my_string);
		}
		return answer.toString();
	}

}
