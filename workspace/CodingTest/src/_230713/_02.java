package _230713;

//접두사인지 확인하기
//my_string 이라는 문자열이 is_prefix로 시작하는 지
//확인하기 String 함수 startWith를 사용해서 여부 확인
// << 체크할 문자열.startWith(체크대상이 되는 문자) >>
//문장이 끝나는 여부를 확인하는 endWith도 있다.
public class _02 {
	public int solution(String my_string, String is_prefix) {
        
        return my_string.startsWith(is_prefix)? 1 : 0;
    }

}
