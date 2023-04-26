package codingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _0402_2 {
	// atm
	// 대기시간과 인출시간을 합을 구하는 문제

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); //사람의 수
		List<Integer> p = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			p.add(sc.nextInt());
		}
		Collections.sort(p);
		int sum = 0;
		int waitingTime = 0;
		for (int i = 0; i < n; i++) {
			
			waitingTime += p.get(i);
			sum += waitingTime;
		}
		System.out.println(sum);

	}
}
