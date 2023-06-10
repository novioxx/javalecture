package _230610;

public class _02 {
	// 문자열안에 문자열
	// 문자열 str1안에 문자열 str2가 포함되어 있는지 확인하고 있으면 1, 없으면 2을 return
	public int solution(String str1, String str2) {
		int answer = 0;

		if (str1.contains(str2)) {
			answer = 1;
		} else
			answer = 2;

		return answer;
	}

}
