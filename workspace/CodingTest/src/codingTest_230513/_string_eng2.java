package codingTest_230513;

public class _string_eng2 {
	public int solution(String s) {
		//숫자 문자열 s에 해당하는 단어를 찾아 숫자로 변환하는 문제
		//0은 시작에 주어지지 않지만 문자열에 포함되어 있어야 에러가 안남
		
		String[]e = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	    String[]n = {"0","1","2","3","4","5","6","7","8","9"};     
	    
		for(int i = 0; i < 10; i++) {
			s = s.replaceAll(e[i],n[i]);
			//s에서 e,n 대체할 문자열을 찾고 s에 담아서 s에 담긴 문자열을 숫자로 치환
		}
		return Integer.parseInt(s);
	}
}

