package _230529;

public class _02 {
	// 특정 문자 제거하기
	// 매겨변수 my_string,letter가 주어질 때 my_string에서 letter에 해당되는 문자를 제거해서 출력
	public String solution(String my_string, String letter) {
		String answer = "";
		answer = my_string.replaceAll(letter, "");
		return answer;
	}

}
