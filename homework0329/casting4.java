package homework0329;

import java.util.Scanner;

public class casting4 {

	public static void main(String[] args) {
		//   사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요
	
		Scanner sc = new Scanner(System.in);
		System.out.println("실수를 입력하세요");
		double di = sc.nextDouble();
		
		
		double num1 = Math.pow(di, 2);
		String result = Double.toString(num1);
		System.out.println(result);
		
		
		
		
				
		
		
	
		
			
		
	
	
	
	
	
	}
	
}
