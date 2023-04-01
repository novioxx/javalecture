package homework0329;


public class repeat2 {
    public static void main(String[] args) {
    	//2의 거듭제곱을 10회동안 반복하며 출력하세요.(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
    	int num = 2;
    	int move = 1;
    	
    	
        for(int i = 1; i <= 10; i++) {
        	move *= num;
        
        	
        	System.out.println(num + "의 거듭제곱"+i+"은 :"+move);
        }

    }
}


		
	

