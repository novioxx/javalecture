package homework0329;

import java.util.Scanner;

public class condition3 {

	public static void main(String[] args) {
		// 사용자가 입력한 문자열이 "Java"인 경우 "좋아하는 언어입니다."를 출력하고, "Python"인 경우 "공부중인 언어입니다."를 
	   //	출력하고, 그렇지 않은 경우 "다른 언어를 공부해보세요."를 출력하세요.(switch~case~default 사용)
		String language = "java";

		switch(language) {
		case "java":
			System.out.println("좋아하는 언어입니다");
		break;
		case "python":
			System.out.println("공부중인 언어입니다");
			break;
		default:
			System.out.println("다른 언어를 공부할께요");
			break;
		}
		
		
			
		}

		
	}

