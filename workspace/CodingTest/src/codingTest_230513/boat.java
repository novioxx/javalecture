package codingTest_230513;

import java.util.Arrays;

public class boat {
	// 구명보트에 최대 2명 탈수있고, 무게 제한 100kg이하,일 때 필요한 구명보트 수
	// 구명보트의 무게 제한은 people의 최대값보다 큼
	public int solution(int[] people, int limit) {
		int answer = 0;
		int p = limit / 2; // 무게제한을 2로 나눈 p 변수를 선언해서 작은 수와 큰 수를 구분,중간 값
		int min = 0; // 무게제한 보다 가벼운 체중의 사람
		int max = 0; // 무게제한 보다 무거운 체중의 사람

		for (int i : people) {
			while(min <= p && p < max) {
			if(max == p || min == p) {
				min = i; //중간값 같은 가벼운 사람
				people[] < p -> ++ 구한 -> 홀수일 때-> 혼자타는사람  짝수일 때 모두 같이 
				> p -> ++ answer

			}else if (i < p) {
				min = i; //가벼운 사람
				
			}else {
				max = i; //무거운 사람
			}
			if (min + max <= limit) { // 2명이서 limit보다 작거나 같은 경우 탑승
				answer++;
				min = 0;
				max = 0;
			} else { //max만 탑승하고 초기화
				answer++;
				max = 0;
			}
			}
		}
		return answer;
	}
}
