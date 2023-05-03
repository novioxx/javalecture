package codingTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Resist {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//answer = (num1 + num2) * Math.pow(10,num3)
		long answer = 0;
		Map<String, Integer> map = new HashMap<>();
		map.put("black", 0);
		map.put("brown", 1);
		map.put("red", 2);
		map.put("orange", 3);
		map.put("yellow", 4);
		map.put("green", 5);
		map.put("blue", 6);
		map.put("violet", 7);
		map.put("grey", 8);
		map.put("white", 9);

		System.out.println("첫번째 입력 :");
		String color1 = scanner.next();
		System.out.println("두번째 입력 :");
		String color2 = scanner.next();
		System.out.println("세번째 입력 :");
		String color3 = scanner.next();

		int num1 = map.get(color1);
		int num2 = map.get(color2);
		long num3 = (long)Math.pow(10, map.get(color3)); 
		//Math.pow를 사용하면 double로 자동변환되기 떄문에 int형로 강제 형변환

		answer = (num1 * 10 + num2) * num3; //num1에 10을 곱해서 자릿수를 반영

		System.out.println(answer);

		scanner.close();
	}
}
