package homework0329;

import java.util.Scanner;

public class operator6 {

	public static void main(String[] args) {
		// 삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가 100보다 크면 "100보다 큼" 
		//  작으면 "100보다 작음" 같으면 "100"을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		String str1 = (num > 100) ? "100보다 큼" : ((num< 100) ? "100보다 작음" : "100이랑 같음");		
		System.out.println("입력하신 정수는 : "+ str1);
			
		
		
		
		
		
	}

}
