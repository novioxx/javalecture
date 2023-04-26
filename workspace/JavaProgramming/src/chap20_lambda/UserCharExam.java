package chap20_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import chap20_lambda.clazz.UserCharString;

public class UserCharExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<UserCharString> li = new ArrayList<UserCharString>();
		
		for(int i = 0; i < 3; i++) {
		System.out.println("문자를 입력하세요");
		li.add(new UserCharString(sc.nextLine()));
		
		}
		System.out.println("찾을 문자를 입력하세요");
		char ch = sc.nextLine().charAt(0);
	
		for(UserCharString u: li) {
			u.changeStr(ch,(char c,String s) -> {
				String returnStr = "";
				for(int i =0; i < s.length(); i++) {
					if(s.charAt(i) == c);
					returnStr = s;
				}
			});
		}

		
		
		System.out.println();

		sc.close();
		return returnStr;
	}

}
