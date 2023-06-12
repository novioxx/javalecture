package _230612;

public class _01 {
	// 마지막 두 원소
	// 정수 리스트 num_list, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을
	// 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length + 1];
		int last = 0;
		if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
			last = num_list[num_list.length - 1] - num_list[num_list.length - 2];
		} else {
			last = num_list[num_list.length - 1] * 2;
		}

		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[i];
		}
		answer[answer.length - 1] = last;
		return answer;
	}
}
