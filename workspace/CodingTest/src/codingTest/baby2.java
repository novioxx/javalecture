package codingTest;

//문자열 순회시키고 중복제거하고 해당되는 문자열 체크해서 카운트 세기
public class baby2 {

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            if(babbling[i].matches("^(aya|ye|woo|ma)+")){
                answer++;
            }
        }
        return answer;
    }
}

}