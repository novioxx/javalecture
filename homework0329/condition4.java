package homework0329;

import java.util.Scanner;

public class condition4 {

	public static void main(String[] args) {
		// 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고 
		// 3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.(switch~case~default 사용)

		int num = 25;
		
		switch(num % 3) {
		case 0:
			System.out.println("3의 배수입니다");
		break;
		default:
			System.out.println("3의 배수가 아닙니다");
			break;

		}
		
		
			
		}

		
	}

