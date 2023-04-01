package homework0329;

import java.util.Scanner;

public class condition7 {

	public static void main(String[] args) {
		// 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고, "No"인 경우 "아니오"를 출력하고, 
		// 그 외의 경우에는 "잘못 입력하셨습니다."를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("yes 아니면 no를 입력하세요 : ");
		String str = sc.nextLine(); 
		
		if(str.equals("yes")) {
			System.out.println(" 예");
			
		}else if(str.equals("no")){
			System.out.println("아니오");
			
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
			
		}

		
	}

