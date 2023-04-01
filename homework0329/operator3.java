package homework0329;

import java.util.Scanner;

public class operator3 {

	public static void main(String[] args) {
		// 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int y = sc.nextInt();
		
		if(y%2==0 && y%7==0) {
			System.out.println("2와7의 공배수입니다.");
		}else{
			System.out.println("2와7의 공배수가 아닙니다.");
		}
		
		
		
		
	}

}
