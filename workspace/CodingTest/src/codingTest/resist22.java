package codingTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class resist22 {
// answer =num1+num2 * Math.pow(10,num3)
	  public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			double answer = 0;
			Map<String, String> map = new HashMap<String, String>();
			map.put("^(black|brown|red|orange|yellow|green|blue|violet|grey|white)$", "\\d+");
			System.out.println(map);
			    System.out.println("첫번째 입력:");
		        String str1 = scanner.nextLine();
		        System.out.println("두번째 입력:");
		        String str2 = scanner.nextLine();
		        System.out.println("세번째 입력:");
		        String str3 = scanner.nextLine();

		        int value1 = Integer.parseInt(map.get(str1));
		        int value2 = Integer.parseInt(map.get(str2));
		        int value3 = Integer.parseInt(map.get(str3));

		        answer = (value1 * 10 + value2) * Math.pow(10, value3);
		        System.out.println(answer);
		}
}


//System.out.println("첫번째 입력 :");
//String str1 = map.get( scanner.nextInt());
//System.out.println("두번째 입력 :");
//String str2 = map.get( scanner.nextInt());
//System.out.println("세번째 입력 :");
//String str3 = map.( scanner.nextInt());
