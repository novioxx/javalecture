package codingTest;

public class Solution {

    public Solution(int[][] board) {
    	int[][] area  = new int [board.length][board[0].length];
    	int n = board.length; 
    	boolean safe = false;
    	int cnt =0;
    
    	
    	for(int a = n -1; a <= a + 1; a++) {
    		for(int b = 0; b <= b + 1; b++) {
    			if(a < 0 || a >= n || b < 0 || b >= n)
    				continue;
    			if(board[a][b] == 1) //지뢰가 맞을 경우
    				safe = false;
    			break;}
    	}
    	 for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n; j++) {
    			if(area[i][j] == 0) { //지뢰가 아닌 경우
    	          safe = true;
    			}
    			if(safe == true) {
    				cnt++;
    			}
    		}
    		return;
    				}
    			}

    	 
    	 
      }
//		지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 
//		지뢰가 없는 지역 0만 존재합니다.
//		지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 
//		return하도록 solution 함수를 완성해주세요.
		
//		board는 n * n 배열입니다.
//		1 ≤ n ≤ 100
//		지뢰는 1로 표시되어 있습니다.
//		board에는 지뢰가 있는 지역 1과 지뢰가 없는 지역 0만 존재합니다.
//		
//		입출력 예 #1
//

//		(3, 2)에 지뢰가 있으므로 지뢰가 있는 지역과 지뢰와 인접한 위, 아래, 좌, 우, 대각선 
//		총 8칸은 위험지역입니다. 
//		따라서 16을 return합니다.

		//		(3, 2), (3, 3)에 지뢰가 있으므로 지뢰가 있는 지역과 지뢰와 인접한 위, 아래, 좌, 우, 
//		대각선은 위험지역입니다. 
//		따라서 위험지역을 제외한 칸 수 13을 return합니다.

		//		모든 지역에 지뢰가 있으므로 안전지역은 없습니다. 따라서 0을 return합니다.
		
	
	
	
	
	
	


