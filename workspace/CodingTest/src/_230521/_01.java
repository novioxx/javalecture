package _230521;

public class _01 {
	//문자 리스트를 문자열로 변환하기
	//String.join() -> String(기준이 될 기호, 배열) (배열 -> 문자열)
	//String 클래스의 메소드로 각 요소 사이에 지정된 구분 기호를 사용하여 문자열 배열의 모든 요소를 연결시킨다.
	public String solution(String[] arr) {
		String answer = String.join("", arr);

		return answer;
	}
}
