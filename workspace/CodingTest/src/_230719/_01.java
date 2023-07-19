package _230719;

import java.util.Scanner;

//대소문자 바꿔서 출력하기
public class _01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (Character.isUpperCase(c)) {
				s += Character.toLowerCase(c);
			} else {
				s += Character.toUpperCase(c);
			}

		}
		System.out.println(s);
	}

}
