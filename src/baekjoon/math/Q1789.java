package baekjoon.math;

import java.util.Scanner;

public class Q1789 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long n = 0;
		int count = 0;
		long s = scan.nextLong(); // �ڿ����� ��

		for (int i = 1; i <= s; i++) { //?
			s-=i;
			count++;
		}

		System.out.println(count);
	}
}

