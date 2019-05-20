package baekjoon.star_print;

import java.util.Arrays;
import java.util.Scanner;

//�� ��� -11
//X
public class Q2447 {
	static char[][] starMap;
	
	public static void solve (int x, int y, int n) {
		if (n == 1){
			starMap[x][y] = '*';
			return;
		}
		int m = n/3;
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (i==1 && j==1){ //�߰� ���� �� ���� ����� �ƴ� �迭�� �� �ʱ�ȭ�̱� ������ ����
					continue;
				}
				solve(x+m*i, y+m*j, m);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		starMap = new char[n][n];

		for (int i = 0; i < n; i++) {
			Arrays.fill(starMap[i], ' ');
		}

		solve(0, 0, n);
		for (int i = 0; i < n; i++) {
			System.out.println(starMap[i]);
		}
	}

}

