package homework0329;

import java.util.Scanner;

public class casting2 {

	public static void main(String[] args) {
		//  사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
		Scanner sc = new Scanner(System.in);
		System.out.println("a의 정수를 입력하세요");
		int a = sc.nextInt();
		System.out.println("b 정수를 입력하세요");
		int b = sc.nextInt();
		
		if(b ==0) {
			System.err.println("b는 0이 될 수 없습니다");
		}else {
			double result = (double)a / b;
			System.out.println("a/b의 연산결과는 : " + result);
		}
			
		
	
	
	
	
	
	}
	
}
