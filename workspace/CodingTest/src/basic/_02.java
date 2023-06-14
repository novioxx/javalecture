package basic;

import java.util.ArrayList;
import java.util.List;

public class _02 {
	//배열 만들기1
	    public List solution(int n, int k) {
	        List<Integer> answer = new ArrayList<>();
	        for(int i = 1; k*i<=n;i++){
	            answer.add(k*i);
	        }
	        return answer;
	    }
	}