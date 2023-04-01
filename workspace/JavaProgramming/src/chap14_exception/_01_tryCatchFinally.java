package chap14_exception;

public class _01_tryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,};
		
		String strArr = new String[3]
		
		int index = 0;
		
		
		while(true) {
			try {
				System.out.println(arr[index++]);
				if(index == 2) {
					System.out.println(10 / 0);
				}
				strArr[0].length();
			} 
			//null.length();  //null은 아무것도 없는 값 0
			catch(ArrayException e) {
				System.out.println(e.getMessage());
				System.out.println(index+"는 배열에 존재하지 않는 인덱스");
			} catch(ArithmeticException ae) {
				System.out.println(ae.getMessage);
				System.out.println("분모를 0이 될수 없습니다");
			}
			catch(nellPointerException ne) {
				System.out.println(me.getMessage);
				System.out.println("널값이 속성이나 메소드를 사용할 수 없다.");
			}
			
		finally {
			if(index < 3) {
				System.out.println("정상출력");
			}
			else {
				System.out.println("예외발생. while문을 종료합니다");
				break;
			}
			System.out.println("정상출력");
		} 
			else {
			System.out.println("예외발생");
			index = 0;
		}
		}
		}

	}

}
