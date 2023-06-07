package _230607;

public class _01 {
	//문자열의 앞의 n글자
	//문자열을 n번째 인덱스부터 리턴
	public String solution(String my_string, int n) {
        String answer = "";
        answer = my_string.substring(0,n);
        
        return answer;
    }
}
