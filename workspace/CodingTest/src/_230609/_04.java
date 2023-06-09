package _230609;

public class _04 {
	//부분 문자열
	//str문자열이 str2문자열에 포함되어 있는 지 확인
	public int solution(String str1, String str2) {
		int answer = 0;

		if (str2.contains(str1))
			answer = 1;

		return answer;
	}
}
