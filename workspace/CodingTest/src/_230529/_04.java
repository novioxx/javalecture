package _230529;

public class _04 {
	// 짝수 홀수 개수
	// 짝수와 홀수의 개수를 세서 배열(짝수,홀수)의 개수 만큼 출력
	public int[] solution(int[] num_list) {
		int[] answer = new int[2];
		for (int i : num_list)
			if(i%2 == 0) 
				answer[0]++;
			else 
				answer[1]++;
	
		return answer;
	}
}
