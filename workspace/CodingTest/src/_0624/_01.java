package _0624;

public class _01 {
	// 아이스 아메리카
	//커피 한잔이 5500원일 때 [0]에는 최대 마실 수 있는 커피 잔 수, [1]에는 남은 money
	public int[] solution(int money) {
		int[] answer = new int[2];

		answer[0] = money / 5500;
		answer[1] = money % 5500;

		return answer;
	}
}
