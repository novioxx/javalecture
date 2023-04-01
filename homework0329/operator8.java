package homework0329;

import java.util.Scanner;

public class operator8 {

	public static void main(String[] args) {
		// 사용자가 입력한 하나의 문자열과 하나의 정수로 "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.
		

		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String x = sc.nextLine();
		System.out.println("정수를 입력하세요");
		int y = sc.nextInt();
		System.out.printf("입력한 문자열"+ x +"이고,");
		System.out.printf(" 입력한 숫자는" + y +"입니다.");
		
	
		
		
	}

}
