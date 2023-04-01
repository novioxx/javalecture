package _0329_;
	 
	public class chicken01 {
	 
		public int solution(int chicken) {
		    int coupon = chicken; // 
		    int service = 0; // 
		    
		    while (coupon >= 10) { // 쿠폰이 10장 이상일 때만 서비스 치킨 주문 가능
		        int order = coupon / 10; // 서비스 치킨 주문 수
		        serviceChicken += order; // 서비스 치킨 수 추가
		        coupon = coupon % 10 + order; // 남은 쿠폰 수 업데이트
		    }
		    return serviceChicken; // 받을 수 있는 서비스 치킨 수 반환
		}

	}


