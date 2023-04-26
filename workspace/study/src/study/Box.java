package study;

public class Box<E> { //클래스명뒤에 <>를 사용하는 제너릭


		// TODO Auto-generated method stub
//		int value1 = Math.max(5, 30);
//		System.out.println(value1);
//		int value2 = Math.min(5, 30);
//		System.out.println(value2);
//		System.out.println(Math.abs(-10));// 절대값 출력 /절대값은 음수양수 제외하고 숫자가 가진 크기
//		System.out.println(Math.random());
//		System.out.println(Math.sqrt(4));// 제곱근 구하는 식
		
		private E obj;
		public void setObj(Object obj) {
			this.obj = obj;
			
		
			
		}
		public E getObj() {
			return obj;
		}
	
		}
	

