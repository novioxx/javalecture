package chap15_usefulClass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//사용자가 5개 정수 입력
		
		//Math.max와 Math.min을 이용하여
		//최소값, 최대값 출력
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		String sc = scanner.nextLine();
		
		
		int[] num = new int[5];
		num[i] = sc.nextInt();
		
		
		int max = num[0];
		int min = num[0];

		for (i =0; i <num.length; i++) {
			max = Math.max(max,num));
			min = Math.min(min,num));
		}


	}

}
