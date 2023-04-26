package codingTest;

public class chicken22 {

		    public int solution(int chicken) {
		        int answer = 0;
		        int coupon = 0;
		        while(chicken > 0){
		            chicken--;
		            coupon++;  
		            if(coupon == 10){
		                chicken++;
		                answer++;
		                coupon = 0;
		            }
		        }
		        return answer;
		    }
		}