package homework0329;

public class vari6 {

	public static void main(String[] args) {
		//사용자가 입력한 정수의 구구단을 출력하세요.(출력 양식 => 2를 입력했을 때 2 * 1 = 2
//		  2 * 2 = 4
//		  .....
//		  2 * 9 = 18 
		int i = 0;
		int j = 0;

		for(i = 2; i < 10; i++) {
			for(j = 1; j < 10; j++){
				System.out.println(i + "x" + j + "=" + (i*j));
			
		}
			System.out.println();
	}
	

}
}
