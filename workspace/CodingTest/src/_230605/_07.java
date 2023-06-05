package _230605;

public class _07 {
	// 배열 두배 만들기 : 배열에 담긴 숫자를 각각 * 2 한 값으로 리턴
	// 예) [1,2,3] -> [2,4,6]
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++)
			answer[i] = numbers[i] * 2;

		return answer;

	}
}
