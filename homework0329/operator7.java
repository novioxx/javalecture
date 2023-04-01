package homework0329;

import java.util.Scanner;

public class operator7 {

	public static void main(String[] args) {
		// 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
		

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 실수를 입력하세요");
		double x = sc.nextDouble();
		System.out.println("두번째 실수를 입력하세요");
		double y = sc.nextDouble();
		
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		
	}

}
