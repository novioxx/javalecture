package _0624;

public class _03 {
		//점의 위치 찾기
	 public int solution(int[] dot) {
	        int answer = 0;
	        if(dot[0] > 0) 
				if (dot[1] > 0)
					answer = 1;
				else
					answer = 4;
	        
			else if (dot[1] > 0)
				answer = 2;
			else
				answer = 3;

			return answer;
		}
	}


