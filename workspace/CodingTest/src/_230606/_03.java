package _230606;

public class _03 {
	// rny_string
	// 문자열의 m을 모두 rn으로 바꿔서 출력
	public String solution(String rny_string) {
		String answer = "";

		answer = rny_string.replaceAll("m", "rn");

		return answer;
	}
}
