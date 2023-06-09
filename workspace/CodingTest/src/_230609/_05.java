package _230609;

public class _05 {
	// 배열에서 문자열 대소문자 변환하기
	// 홀수번째 인덱스의 문자열은 대문자로,짝수번째 인덱스의 문자열은 소문자로 반환해서 return
	public String[] solution(String[] strArr) {
		String[] answer = new String[strArr.length];

		for (int i = 0; i < strArr.length; i++) {
			if (i % 2 != 0) {
				answer[i] = strArr[i].toUpperCase();
			} else {
				answer[i] = strArr[i].toLowerCase();
			}

		}

		return answer;
	}

}
