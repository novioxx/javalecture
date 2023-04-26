package study;

import java.util.ArrayList;
import java.util.List;

public class List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list = new ArrayList<>();
		list.add("kim");
		list.add("Lee");
		list.add("kim");
		
		System.out.println(list.size());
		for(int i = 0; i < list.size(); i++) {
		String str = list.get(i);
		System.out.println(str);
			
		}

	
	
	
	}

}
