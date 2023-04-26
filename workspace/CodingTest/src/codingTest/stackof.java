package codingTest;

import java.util.Stack;
import java.util.Scanner;

public class stackof {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int[] stack = new int[n];
	        int top = -1; // 스택의 가장 위에 있는 값의 인덱스를 나타내는 변수

	        for (int i = 0; i < n; i++) {
	            String command = sc.next();

	            if (command.equals("push")) { // push 명령어 처리
	                int x = sc.nextInt();
	                stack[++top] = x;
	            } else if (command.equals("pop")) { // pop 명령어 처리
	                if (top == -1) { // 스택이 비어있는 경우
	                    System.out.println("-1");
	                } else {
	                    System.out.println(stack[top--]);
	                }
	            } else if (command.equals("size")) { // size 명령어 처리
	                System.out.println(top + 1);
	            } else if (command.equals("empty")) { // empty 명령어 처리
	                if (top == -1) {
	                    System.out.println("1");
	                } else {
	                    System.out.println("0");
	                }
	            } else if (command.equals("top")) { // top 명령어 처리
	                if (top == -1) {
	                    System.out.println("-1");
	                } else {
	                    System.out.println(stack[top]);
	                }
	            }
	        }

	        sc.close();
	    }
	}
