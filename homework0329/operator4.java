package homework0329;

import java.util.Scanner;

public class operator4 {

	public static void main(String[] args) {
		// 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요 : ");
		
		String str = sc.nextLine();
		
		if(str.equals("hello")) {
			System.out.println("일치합니다");
			
		}else {
			System.out.println("불일치합니다");
		}
		
		
		
		
	}

}
