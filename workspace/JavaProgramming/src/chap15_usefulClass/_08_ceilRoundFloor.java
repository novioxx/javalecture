package chap15_usefulClass;

public class _08_ceilRoundFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 123.45678;
		
		System.out.println(Math.ceil(num));
		System.out.println((double)Math.round(num));
		System.out.println(Math.floor(num));
		
		//소수점 2자리까지 출력하는 방법 
		//2자리 100 곱하기, 3자리 1000곱하기, 4자리 10000곱하기 ....)
		//실수인 double 넣어주면 소수점자리 출력
		System.out.println((double)Math.round(num*100) / 100);
		
		
		
		
	}

}
