package codingTest;

import java.util.Arrays;

public class _knumber { 
	//i번째에서 j번째까지 자른 후 정렬,k번째 수 구하기{i,j,k}
	//자른 배열을 생성하기 위해 시작,끝,k를 담아줄 변수 선언
	 public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];

	        for (int i = 0; i < commands.length; i++) {
	            int[] command = commands[i]; 
	           //인덱스 0부터 시작,commands인덱스가 1부터 시작하니 -1
	            int start = command[0] - 1; // 시작 인덱스 배열 
	            int end = command[1] - 1; // 끝 인덱스
	            int k = command[2] - 1; // 찾을 k번째 수 
	        
	            int[] cut = new int[end - start + 1];//i~j까지 자른 배열 생성,마지막 인덱스까지 읽기위해 +1 
	            for (int j = 0; j < cut.length; j++) {
	            	cut[j] = array[start + j];//array [1, 5, 2, 6, 3, 7, 4]
	            }
	            
	            Arrays.sort(cut);

	            answer[i] = cut[k];
	        }
	        return answer;
	    }
	}