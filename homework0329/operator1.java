package homework0329;

import java.util.Scanner;

public class operator1 {

	public static void main(String[] args) {
		// 사용자가 입력한 두 정수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
		// (메소드로 따로 만들지 말고 메인메소드에서 구현)

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int x = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int y = sc.nextInt();
		
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
	}

}
