package _0329_;

import java.util.Scanner;

public class ChickenCoupon {
	public static void main(String[] args) {
		int chicken = 0;
		int coupon = chicken; // 1마리당 1장씩 증감조건이 같음
		int service = 0; // 서비스 치킨 수
		int couponcnt = 0;
		int remain = 0;
		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("몇 마리나 드셨어여?: ");
		chicken = scanner.nextInt();

		for (int i = 0; i <= chicken; i++) {
			if (i % 10 == 0) { // 쿠폰이 10장이 될 떄마다 sv, cp 추가
				service++;
				couponcnt++;

				if (couponcnt / 10 == 0) {
					service += couponcnt; // 서비스 치킨 수 증가
					remain = coupon % 10 + couponcnt; // 남은 쿠폰 수 계산
					sum = i + service;
					chicken = 0;

				}
			}
			System.out.println("받을 수 있는 최대 서비스 치킨 수: " + sum + " 서비스로 받은 치킨 수 : " + service);
			System.out.println(coupon);
			System.out.println(sum);
		}

	}
}
