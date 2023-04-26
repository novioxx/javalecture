package study;

import java.util.ArrayList;
import java.util.Arrays;

public class List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인터페이스이기 떄문에 객체 생성이 안됨 ArrayList를 써서 객체 생성
//		List<String> num = new ArrayList<>();
//		num.add("135");
//		num.add("129");
//		num.add("142");
//		
//		System.out.println(num.size());
//		System.out.println(num.get(0));
//		System.out.println(num.get(1));
//		System.out.println(num.get(2));
//		System.out.println(num.contains("142"));
//		System.out.println(num.remove("121"));
//		System.out.println(num.remove(1));
		
		//문자열 배열을 이용한 Arrays 사용법
//		String[]str = {"135", "129", "142"};
//		ArrayList<String> arr = new ArrayList<>(Arrays.asList(str));
//		//java.util.Arrays 클래스의 asList 메서드를 사용하면 이미 존재하는 문자열 배열로 
//		//ArrayList를 생성할 수 있다.
//		System.out.println(arr);
		
		//Array의 다른 사용 방식
		ArrayList<String> arr = new ArrayList<>(Arrays.asList("138","129","142"));
		System.out.println(arr);

		
		}
		
		
		
		
		
		}

	


