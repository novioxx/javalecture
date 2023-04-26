package study;

public class StringBuffer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello world";
		String str2 = str1.substring(5);
		System.out.println(str1);
		System.out.println(str2);

		String str3 = new StringBuffer().append(str1).append(str2).toString();
		System.out.println(str3);

		String str4 = "";
		for (int i = 0; i < 100; i++) {
			str4 = str4 + " *";

		}
		System.out.println(str4);

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 100; i++) {
			sb.append(str4);
		}
		String str5 = sb.toString();
		System.out.println(str4);
	}

}
