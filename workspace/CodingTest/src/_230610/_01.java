package _230610;

import java.util.stream.IntStream;

public class _01 {
	// 짝수는 싫어요
	// n안에 들어가는 숫자를 홀수만,오름차순으로 return
	public int[] solution(int n) {
		return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
	}

}
