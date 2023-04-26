package codingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
//서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return
//중복없이 오름차순으로 정렬된 숫자 리스트 구하는 문제
public class _0426 {
	  public List<Integer> solution(int[] numbers) {
		  
		 TreeSet<Integer> set = new TreeSet<>();//오름차순으로 정렬하는 특징을 가짐 TreeSet
	        
	        for(int i = 0; i < numbers.length-1; i++) {  //j가 i와 인덱스의 길이가 같거나 작다면 중복값이 발생한다.
	        	for(int j = i+1; j <numbers.length; j++) {//중복값 제거 
	        		set.add(numbers[i] + numbers[j]);
	        	}
	        }
	         
	        return new ArrayList<>(set); //list로 변환해서 리턴
	        
	         //인덱스가 같을 경우  
	        //{1,2,3}배열에서 i가 0일때 j가 2이면 1+3 =4, i가 2일때 j가 0인 경우 3+1=4 이미 4를 추가했기 때문에 중복이 발생한다.
	        
	        
	    }
}
