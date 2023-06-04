package _0624;

import java.util.Arrays;

public class _04 {
	// 삼각형의 완성조건
	//가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
	//세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return.
	public int solution(int[] sides) {
		int answer = 0;

		Arrays.sort(sides);

		answer = (sides[2] >= sides[0] + sides[1]) ? 2 : 1;

		return answer;
	}
}
