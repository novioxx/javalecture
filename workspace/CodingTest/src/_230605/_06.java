package _230605;

public class _06 {
	public String solution(String my_string) {
		String answer = "";

		answer = my_string.replaceAll("[aiueo]", "");

		return answer;
	}

}
