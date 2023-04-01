package homework0329;

import java.util.Scanner;

public class condition6 {

	public static void main(String[] args) {
		// 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE; //max의 값을 작은 값으로 초기화
		
		for(int i = 1; i < 5+1; i++) {
			System.out.println(i+"번째 정수를 입력하세요 :");
		int num = sc.nextInt();
		
		if(num> max) {
			max = num;
		}
		}
			System.out.println("입력받은 5개의 정수 중 가장 큰 수는 : "+max);
			
		}

		
	}

