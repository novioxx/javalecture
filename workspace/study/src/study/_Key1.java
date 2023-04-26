package study;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class _Key1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//데이터를 저장하는 자료구조
		//key를 이용해서 value를 찾기 때문에 key는 중복될 수 없다.
		Map <String, String> map = new HashMap<>();
		map.put("001","kim");
		map.put("002","lee");
		map.put("003","choi");
		
		map.put("001", "kang");
		
		System.out.println(map.size());
		
			System.out.println(map.get("001"));
			System.out.println(map.get("002"));
		
		 Set<String> keys = map.keySet();
		 
		 Iterator<String> iter=  keys.iterator();
		 while(iter.hasNext()) {
			 String key = iter.next();
			 String value = map.get(key);
			 System.out.println(key + ":"+value);
			 
		 }
		 
	
	
	
	
	}
		
	
	
	
	
}


