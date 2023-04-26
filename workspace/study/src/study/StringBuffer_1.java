package study;

public class StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");

		String str = sb.toString();
		System.out.println(str);

		String sb3 = new StringBuffer().append('a').append('b').toString();
		System.out.println(sb3);

	}

}
