package baekjoon.etc;

import java.util.Scanner;

//���װ��3
//X
//���װ�� ������ �� ��������̴�.
//�Ľ�Į�� �ﰢ���� �̿��� ���װ�����ϱ�
public class Q11401 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), k=scan.nextInt();
		int [][] a = new int [4000001][4000001]; 
			a[1][0] = 1;
			a[1][1] = 1;
			for(int i = 2; i<=n; i++) {
				for(int j=0; j<=k; j++) {
					if(i == j || j == 0)
						a[i][j] = 1;
					else
						a[i][j] = a[i-1][j-1] + a[i-1][j]; //���װ�� ����
					a[i][j] %=1000000007;
				}
			}
		System.out.println(a[n][k]);	
		scan.close();
	}
}
