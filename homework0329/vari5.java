package homework0329;

import java.util.Scanner;

public class vari5 {

	public static void main(String[] args, int i) {
		// 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
		int arr[] = {10, 15, 20};
		
		int max = arr[0];
		int mid = arr[1];
		int min = arr[2];
		
		for(int i = 0; i < arr.length; i++ )
			if(max > arr[i]) {
				System.out.println("최대값은 :"+ max);
			}
			if(min < arr[i]) {
				System.out.println("최소값은 :" + min);
			}
			if(min < mid && mid< max) {
				System.out.println("중간값은 :" + mid);
			}
	
		
		
		
	}

}
