package chap15_usefulClass;

public class _01_object {
	public static class Example implements Cloneable {
			// clone 메소는 cloneable 인터페이스를 상속받아
			// clone 직접 사용하여 구현해야 한다.
		public Object clone() {
			Object obj = null;
			try {
				//super.clone() object에 있는
//				clone메소드를 호출하는데
//				clone메소드에서 전달하는 예외가
//				cloneNotSupportedException이기 때문에
//				catch구문에서 동일한 예외로 받아준다.
				obj = super.clone();
			}catch(CloneNotSupportedException ce) {
				System.out.println(ce.getMessage());
			}
			return obj;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex1 = new Example(); 
		Example ex2 = (Example)ex1.clone();
		
		if(ex1.equals(ex2)) {

			System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}
		//객체의 얕은 복사
		ex2 = ex1;
		
		if(ex1.equals(ex2)) {
			System.out.println("같은 객체 입니다.");
		}else {
			System.out.println("다른 객체 입니다.");
		}
			
		
			
			
		}
		

	}


