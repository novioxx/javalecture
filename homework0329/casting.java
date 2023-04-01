package homework0329;

import java.util.Scanner;

public class casting {

	public static void main(String[] args) {
		//  사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번쨰 정수를 입력하세요");
		String str1 = sc.nextLine();
		System.out.println("두번째 정수를 입력하세요");
		String str2 = sc.nextLine();
		
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int sum =  num1 + num2;
		
		System.out.println("두 정수의 합은 : "+ sum);
		
		
		
		
		
		
		
		
		
		
	}

}
