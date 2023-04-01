package chap15_usefulClass;

public class _07_stringBuffer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer(100);
		StringBuffer sb2 = new StringBuffer("bitcamp");
		
		sb1.append("naverCloud");
		//capacity()와 length의 차이점
		System.out.println(sb1.capacity());//담겨있는 문자열의 크기
		System.out.println(sb1.length());//담겨있는 문자열의 길이
		
		sb2.delete(3, 7);
		StringBuffer sb3 = sb2.delete(3, 7);
		System.out.println(sb3);
		
		//delete()와 insert()
		sb3 = sb3.insert(3,  "camp");
		System.out.println(sb3);
		
		//reverse()
		sb1 = sb1.reverse();
		System.out.println(sb1);
		
		//setCharAt()
		sb3.setCharAt(3, 'c');
		System.err.println(sb3);
	
		//setLength()
		sb3.setLength(10);
		System.out.println(sb3);
	
	
	
	
	}
	
	
	

}
