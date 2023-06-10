package _230610;

import java.util.regex.Pattern;

public class _08 {
	// 대문자와 소문자
	// 대문자는 소문자로, 소문자는 대문자로 바꿔서 return
	public String solution(String my_string) {
		String answer = "";
		String[] arr = my_string.split("");

		for (int i = 0; i < arr.length; i++) {
			answer += Pattern.matches("[a-z]", arr[i]) ? arr[i].toUpperCase() : arr[i].toLowerCase();
		}
		return answer;
	}

}
