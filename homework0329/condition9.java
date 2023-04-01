package homework0329;

import java.util.Scanner;

public class condition9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("세 정수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        if (a % 2 == 0) evenCount++;
        else oddCount++;

        if (b % 2 == 0) evenCount++;
        else oddCount++;

        if (c % 2 == 0) evenCount++;
        else oddCount++;

        if (evenCount == 3) System.out.println("모두 짝수입니다.");
        else if (oddCount == 3) System.out.println("모두 홀수입니다.");
        else System.out.println("짝수: " + evenCount + "개, 홀수: " + oddCount + "개 입니다.");
    }
}


		
	

