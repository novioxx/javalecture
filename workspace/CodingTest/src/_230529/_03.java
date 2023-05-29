package _230529;

public class _03 {
	// 문자열 뒤집기
	//for문을 사용해서 my_string 문자열을 거꾸로 출력
	public String solution(String my_string) {
		String answer = "";
		for (int i = my_string.length() - 1; i >= 0; i--)
			answer = answer + my_string.charAt(i);
		return answer;
	}
}
