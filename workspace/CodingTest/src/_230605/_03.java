package _230605;

public class _03 {
	//피자 나눠먹기
	//피자 7조각으로 잘라줄 때,n만큼의 사람이 최소 한 조각씩 먹으려면 
	 public int solution(int n) {
	        int answer = 0;
	        
	        if( n % 7 == 0)
	            answer = n / 7;
	        else
	            answer = n / 7 + 1;
	        
	        return answer;
	    }
	}
