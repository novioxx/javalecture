package chap15_usefulClass;

public class _11_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer 생성사 자바 9번부터는 사용불가 new Integer 사용이 안됨
		Integer num1 = Integer.valueOf(100);
		Integer num2 = Integer.valueOf(100);
		
		System.out.println(num1 == num2);//같은 객체를 바라보고 있는지 주소 비교
		System.out.println(num1.equals(num2)); //equals메소드가 오버라이딩 되어있어 값만 비교
		//같으면 0, 작으면 1 크면 - 1
		System.out.println(num1.compareTo(num2));
		

		String numStr = "1000";
		int convertNum = Integer.parseInt(numStr);
		System.out.println(convertNum);
		System.out.println(Integer.valueOf)(convertNum)getClass().getName);
	
		//int의 최대값,최소값을 상수인 멤버변수로 지정해놔서 
		//멤버변수를 호출하면 확인가능하다.
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	
		//문자열로 변환
		String converStr = num1.toString();
		System.out.println(convertStr.getClass().getName);
		
		System.out.println("size="+ num1.SIZE);
		System.out.println("btyes="+ num1.BYTES);
		System.out.println("type="+ num1.TYPE);
	
		//문자열을 정수형으로 변환
//		System.out.println(Integer.parseInt("ff")); 에러
		System.out.println(Integer.parseInt("ff",16));
		
		
		
	}

}
