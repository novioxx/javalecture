package _230518;

public class _lotto {
	// 0의 개수와 일치하는 수를 cnt 해서 일치하는 개수와 등수 확인 최저,최고의 등수 리턴
	public int[] solution(int[] lottos, int[] win_nums) {
//        int[] answer = {};
        int zero = 0; //알 수 없는 번호
        int same = 0; // 일치하는 번호
        int win = win_nums.length;
        
        for(int i : lottos) {
        	if(i == 0) {
        	zero++;	
        	}else {
        		for(int j : win_nums) {
        			if(i == j) {
        				same++;
        				break;
        			}
        		}
        	}
        }
        int min = same;
        int max = same + zero;
               
        //answer{일치개수, 등수}
        int[]answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};
     
        return answer;
    }
}
