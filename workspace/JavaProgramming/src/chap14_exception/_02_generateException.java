package chap14_exception;

public class _02_generateException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArrayIndexOutOfBoundsException aie =
					new ArrayIndexOutOfBoundsException(
							"분모가 0일 수 없습니다");
			throw aie;
			
			//1. NullPointerException
//			NullPointerException ne =
//					new NullPointerException("null입니다");
//			throw ne;
			
			//2. ArithmeticException
			
		}
		catch (NullPointerException ne) {
			
		} 
		catch (ArithmeticException ae){
			
			
		}
		catch(Exception e) {
			//마지막 catch문은 위에 선언한 catch문을 
			//다 통과한 예외들을 처리할 수 있게 
			//모든 예외를 담을 수 있는 예외의 최상위 클래스
			//Exception으로 예외를 처리해준다.
 			System.out.println(e.getMessage());
			
		}
		finally {
			
		}
	}

}
