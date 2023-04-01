package homework0329;

import java.util.Scanner;

public class operator5 {

	public static void main(String[] args) {
		// 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		String str =  (num %2 != 0)? "홀" :"짝";
		System.out.println("입력하신 정수는 "+ str + "입니다");
			
		
		
		
		
		
	}

}
