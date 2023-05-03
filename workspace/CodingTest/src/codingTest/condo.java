package codingTest;

import java.util.Arrays;
import java.util.Comparator;

public class condo {
	// 바닷가에서 가까운 거리 기준으로 정렬(오름차순),비교할 최소 숙박비 변수선언, 첫번째 숙박비보다 싼 경우 후보에 추가하고 저렴한 숙박비 갱신.
	public static void main(String[] args) {
        int[][] condos = {{300, 100}, {100, 300}, {400, 200}, {200, 400},{100, 500}};//[거리][숙박비] 정보
        int n = condos.length; //콘도의 갯수를 담은 n

        Arrays.sort(condos,(a,b)-> a[0]!=b[0] ? a[0]-b[0] : a[1]-b[1]); //거리를 기준으로 오름차순 정렬
//        Arrays.sort(condos,(d,c)-> Integer.compare(d[0], c[0]));
        //condos 배열을 오름차순으로 정렬, Integer.compare 거리를 기준으로 비교

        int answer = 1; // 후보 콘도를 담아줄 변수,첫 번째 콘도는 가장 가까운 거리에 있기 떄문에 후보 콘도에 포함 D(1 ≤ D ≤ 10,000)
        int min = condos[0][1]; // 현재 가장 저렴한 숙박비
        
        for (int i = 0; i < n; i++) {
            if (condos[i][1] < min) { // 현재 숙박비가 최소값보다 싸면 후보 콘도로 추가
            	answer++;
            	min = condos[i][1];// 숙박비 최소값 갱신
            	
            }	
            
        }
       
        System.out.println(answer);
    }
}



