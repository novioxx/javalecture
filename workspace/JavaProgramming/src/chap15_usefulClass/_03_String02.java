package chap15_usefulClass;

public class _03_String02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str1 = "computer";
			String str2 = "smartPhone";
			String str3 = "abcdhadecba";
			
			//포함여부 검사
			if(str1.contains("tP")) {
				System.out.println("str1은 tP를 포함합니다.");
			}else {
				System.out.println("str1은 tP를" + "포함하지 않습니다.");
			}
			
			//해당 문자나 문자열의 인덱스 확인
			int index1 = str2.indexOf('h');
			int index2 = str3.indexOf('a',4);
			int index3 = str3.indexOf("abc");
			
			int index4 = str3.indexOf('h');
			int index5 = str3.indexOf('a',7);
			int index6 = str3.indexOf("bc");
			
			//문자열 길이
			int[] intArr = new int[10];
			System.out.println(intArr.length);
			
			System.out.println("str1의 길이는 "+ str1.length()+"입니다");
			
//			List <lnteger> intList = new ArrayList <Integer>();
			
//			intList.add(1);
//			intList.add(1);
//			intList.add(1);
//			intList.add(1);
//			System.out.println(intList.size());
			
			//replace, replaceAll(정규식 사용가능)
			String str4 = "abc"
					+ "abc"
					+ "abc"
					+"aabbcc";
					
			
			System.out.println(str4.replace("abc","111"));
			//[]괄호안에 문자를 전부 치환한다.
			System.out.println(str4.replaceAll("[ac]", "2"));
			System.out.println(str4.replace('a','1')
								   .replace('b','2')
								   .replace('c','3'));
			// 체인기법 결과값에다가 . 찍어서 계속 사용할 수 있음
			
			

			
			
			
			
			
			
			
			
			
			
			
			
	}

}
