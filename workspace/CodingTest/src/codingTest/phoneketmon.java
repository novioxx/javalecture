package codingTest;

import java.util.HashSet;

public class phoneketmon {

	public int solution(int[] nums) {
		// 최대한 많은 종류의 포켓몬을 가져가기 위해 중복을 제거
		// set에 담긴 크기와 최대 경우 값인 nums와 비교
		int answer = 0;
		int n = nums.length / 2; // 최대로 가져갈 수 있는 포켓몬 수

		HashSet<Integer> set = new HashSet<>();
		for(int i : nums) {
			set.add(i); // 중복을 제거한 포켓몬 수를 set 에 담음
		}
			if (set.size() >= n) {
				answer = n; 
			} else {
				answer = set.size(); 
			}
		return answer;
	}
}
