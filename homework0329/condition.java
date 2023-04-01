package homework0329;

import java.util.Scanner;

public class condition {

	public static void main(String[] args) {
		// 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요");
		int x = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int y = sc.nextInt();
		
		int num = (x > y) ? x : y;

		System.out.println("입력하신 두 정수중 큰 정수는 :"+ num);
		
	}
}
