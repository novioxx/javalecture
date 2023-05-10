package codingTest;

import java.util.Arrays;

public class minRectangle {
	//최소직사각형을 구하기 위해 한 변을 정렬해서 최소값을 찾고 가장 작은 값중에 가장 큰 값 구하기
	    public int solution(int[][] sizes) {
	      int w = 0; //가로
	      int h = 0; //세로
	        
	    for(int i = 0; i < sizes.length; i++) {
	        Arrays.sort(sizes[i]);//오름차순으로 정렬해서 가장 작은 값 구하기
	        w = Math.max(w,sizes[i][0]); 
	        h = Math.max(h,sizes[i][1]);
	    }
	        return w * h;

	    }
	}

