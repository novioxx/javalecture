package homework0329;

import java.util.Scanner;

public class condition2 {

	public static void main(String[] args) {
		// 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.

		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int x = sc.nextInt();
		
		
		if(x > 0) { 
			System.out.println("입력 하신 값은 양수 : " + x);
		}else {
			
			System.out.println("입력 하신 값은 음수입니다");
		}

		
	}
}
