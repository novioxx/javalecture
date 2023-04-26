package study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _set {
		//set은 중복이 없고 순서도 없는 자료구조
	public static void main(String[] args) {
		//set은 인터페이스이기 떄문에 new해서 객체를 생성할 수가 없다
		//랭 패키지가 아니기 떄문에 import를 해야 set을 사용할 수 있다
		Set<String>set1 = new HashSet<>();
		boolean flag = set1.add("hello");
		boolean flag2 = set1.add("kim");
		boolean flag3 = set1.add("hello");
		
		System.out.println(set1.size()); //자료구조의 크기를 알아봐주는 size
		//3개를 입력해서 3개가 나와야 하지만 중복되는 것이 있어 2개만 나온다.
		
		System.out.println(flag);
		System.out.println(flag2);
		System.out.println(flag3);
		
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) { //자료를 읽어옴
			String str = iter.next(); //String타입으로 설정했기 때문에 String타입으로 값을 꺼내옴
			System.out.println(str);
		}
		
		
		
		
		
		
	}

}
