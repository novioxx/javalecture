package _230529;

public class _01 {
	public int solution(String message) {
		//프로그래머스 편지
		//2cm크기의 글자를 쓸수 있는 최소 종이사이즈에 대한 문제
		//입출력 예 -> ("happy birthday!", 	30),("I love you~",	22)
		//message 길이에다가 2를 곱하면 해결.
		int answer = message.length() * 2;
		return answer;
	}
}
