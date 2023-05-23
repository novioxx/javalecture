package _230521;

public class _08 {
	//길이에 따른 연산
	//정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 
	//있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
	//리스트의 길이가 11이상이면 +, 10이하면 *.
	//answer 변수 하나에 담으려고 하니 곱하는 값에서 답을 도출하지 못해서 곱한 값을 위한 초기값 1을 값는 answer를 선언하니 
	//답이 도출되었다
		 public int solution(int[] num_list) {
				int answer = 0;
		        int answer2 = 1;

				for (int i : num_list) {
					if (num_list.length >= 11) {
						answer += i;
					} else if(num_list.length <= 10){
						answer2 *= i;
		                answer = answer2;
					}

				}
				return answer;
			}
		}
