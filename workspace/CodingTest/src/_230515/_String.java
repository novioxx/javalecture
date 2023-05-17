package _230515;

import java.util.Arrays;
import java.util.Comparator;
//문자열 Strings, 정수 n, 알파벳 정렬하고 문자열의 인덱스 n번째 글자 기준으로 정렬
public class _String {
	public String[] solution(String[] strings, int n) {
        Arrays.sort(strings); //알파벳 순으로 정렬
        Arrays.sort(strings, Comparator.comparing((String s) -> s.substring(n, n + 1)));
        //비교자 생성 comparator.comparing(매개변수)
        //n을 기준으로 비교해서 오름차순으로 정렬
        return strings;
    }
}
