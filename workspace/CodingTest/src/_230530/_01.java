package _230530;

public class _01 {
	//피자 나눠먹기
	//피자조각 수 slice, 먹는 사람 n이 주어일 때, n명의 사림이 최소 한 조각씩 먹으려면 필요한 피자 수
    public int solution(int slice, int n) {
        int answer = 0;
        
        answer = (n%slice == 0)? n/slice : n/slice+1;
        return answer;
    }
}

