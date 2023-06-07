package _230607;

import java.util.ArrayList;
import java.util.List;

public class _05 {
	//카운트 업
	//정수 start와 end가 주어질 때, start부터 end까지의 숫자를 차례로 담은 리스트를 return
	public List<Integer> solution(int start, int end) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        for(int i = start; i <= end; i++)
        	list.add(i);
   
        return list;
    }
}

