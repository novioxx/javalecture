package study;

public class BoxExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box box = new Box();
//		box.setObj(new Object());
//		Object obj = box.getObj();
//		
//		box.setObj("hello");
//		box.getObj();
//		String str = (String)box.getObj();
//		System.out.println(str);
//		
//		box.setObj(1);
//		int value = (int)box.getObj();
		
		Box<Object>box = new Box<>(); //제너릭 생성
		box.setObj(new Object());	//어떤 타입도 
		Object obj = box.getObj();
		
		Box<String>box2 = new Box<>();
		box2.setObj("hello");
		String str = box2.getObj();
		
		Box<Integer>box3 = new Box<>();
		box3.setObj(4);
		int v2 = box3.getObj();
	}

}
