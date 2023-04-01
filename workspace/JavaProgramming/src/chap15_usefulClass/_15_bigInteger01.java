package chap15_usefulClass;

import java.math.BigInteger;

public class _15_bigInteger01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger bint1 = new BigInteger("1000");
		BigInteger bint2 = BigInteger.valueOf(3000L);
		
		//타입 변환
		String str = bint1.toString();
		int num = bint1.intValue();
		float fNum = bint1.floatValue();
		
		//연산
		System.out.println(bint1.add(bint2));
		System.out.println(bint1.subtract(bint2));
		System.out.println(bint1.multiply(bint2));
		System.out.println(bint1.divide(bint2));
		System.out.println(bint1.remainder(bint2));


	}

}
