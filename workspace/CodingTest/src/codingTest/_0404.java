package codingTest;

import java.util.Scanner;

public class _0404 {
	
	public static int solution(int M, int N) {
		int answer = 0;
		
		if (0 < M && N < 100) {
			answer = M * N - 1;
		}
		return answer;
	}
		
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println(" M의 정수를 입력하세요 : ");
			int M = sc.nextInt();
			System.out.println(" N의 정수를 입력하세요 : ");
			int N = sc.nextInt();
			int result =  solution(M, N);
			sc.close();
			System.out.println(result);
	}
}
