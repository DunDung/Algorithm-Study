package baekjoon.implementation;

import java.util.Scanner;

//�л�ó��
public class Q1009 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			long a = scan.nextLong();
			long b = scan.nextLong();
			long k = a;
			for(int j=0; j<b-1; j++) {
				k*=a;
				k=k%10;
			}
			if(k%10 == 0) //10�� ° ��ǻŸ
				System.out.println(10);
			else
				System.out.println(k%10);
		}
	}
}
