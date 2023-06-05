package _230605;

public class _05 {
	// 머쓱이보다 키 큰 사람
	//친구들의 키들을 담은 array, 머쓱이의 키 height 
	public int solution(int[] array, int height) {
		int answer = 0;

		for (int i = 0; i < array.length; i++)
			if (array[i] > height)
				answer++;
			else
				answer = 0;

		return answer;
	}
}
