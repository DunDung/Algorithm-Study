package baekjoon.divide_and_conquer;

import java.util.Scanner;

//�ϳ��� ž �̵� ����
//X
public class Q11729 {
	static int cnt = 0;
	public static void solve(int n, int x, int y, StringBuilder sb) {
		if (n == 0) return;
		cnt++;
		solve(n-1, x, 6-x-y, sb); //1�ܰ�
		sb.append(x + " " + y + "\n"); //2�ܰ�
		solve(n-1, 6-x-y, y, sb); //3�ܰ�
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		solve(n, 1, 3, sb);
		System.out.println(cnt);
		System.out.println(sb);
	}
}

