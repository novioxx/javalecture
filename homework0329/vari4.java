package homework0329;

import java.util.Scanner;

public class vari4 {

	public static void main(String[] args) {
		// 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
		Scanner s = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요 :");
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();
		
		int sum = a+b+c+d+e;
		int avg = sum / 5;
		
		System.out.println("합 :"+sum);
		System.out.println("평균 : "+avg);
		
		
	}

}
