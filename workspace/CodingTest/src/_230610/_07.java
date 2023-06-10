package _230610;

public class _07 {
	// 암호해독
	// 암호화된 문자열 cipher, code의 배수번째 문자만 진짜 암호일 때 해독된 암호 문자열을 return
	public String solution(String cipher, int code) {
		String answer = "";

		for (int i = code - 1; i < cipher.length(); i += code) {
			answer += cipher.charAt(i);
		}

		return answer;
	}
}
