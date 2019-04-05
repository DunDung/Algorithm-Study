package baekjoon;

import java.util.Scanner;

//���丮�� 0�� ����
//X
//2�� ���ڷ� ���� ������ 5�� ���ڷ� ���� ������ �������� 0�� �ڸ����� ��Ÿ����.

public class Q1676 {
	static int two = 0;
	static int five = 0;
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	    for (int i = 2; i <= n; i *= 2) 
	        two += n / i;
	    
	    for (int i = 5; i <= n; i *= 5) 
	        five += n / i;
	 
	    System.out.printf("%d\n", (two < five) ? two : five);
		scan.close();
	}
}
