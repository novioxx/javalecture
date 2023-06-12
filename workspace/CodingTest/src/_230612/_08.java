package _230612;

public class _08 {
	// 특정한 문자를 대문자로 바꾸기
	public String solution(String my_string, String alp) {
		String answer = "";

		for (int i = 0; i < my_string.length(); i++) {
			answer = my_string.replace(alp, alp.toUpperCase());
		}
		return answer;
	}
}
