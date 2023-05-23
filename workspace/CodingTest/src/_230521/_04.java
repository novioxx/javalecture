package _230521;

public class _04 {
	//정수 부분 -> 실수인 flo를 정수 부분만 리턴
	//int 리턴 타입인 flo를 double로 바꿔주고 floor 메소드를 사용해서 실수부분을 버림 처리
	public double solution(double flo) {
        double answer = 0;
        
         answer = Math.floor(flo);
        
        return answer;
    }
}


