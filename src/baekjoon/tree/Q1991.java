package baekjoon.tree;

import java.util.Scanner;

//Ʈ�� ��ȸ
public class Q1991 {
	static void preOrder(int[][]a, int n) { //������ȸ
		if(n == -1)
			return;
		System.out.print((char)(n+65));
		preOrder(a, a[n][0]);
		preOrder(a, a[n][1]);
	}
	static void inOrder(int[][]a, int n) { //������ȸ
		if(n == -1)
			return;
		inOrder(a, a[n][0]);
		System.out.print((char)(n+65));
		inOrder(a, a[n][1]);
	}
	static void postOrder(int[][]a, int n) { //������ȸ

		if(n == -1)
			return;
		postOrder(a, a[n][0]);
		postOrder(a, a[n][1]);
		System.out.print((char)(n+65));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [][] a = new int[26][2];

		for(int i=0; i<n; i++) {
			String s = scan.next();
			int k = s.charAt(0)-65; //�ƽ�Ű�ڵ� 'A'���� 65�� ���� ���ĺ��� ������ ����
			for(int j=0; j<2; j++) {
				s = scan.next();
				if(s.charAt(0)=='.')
					a[k][j] = -1;
				else
					a[k][j] = s.charAt(0)-65;
			}
		}
		preOrder(a, 0);
		System.out.println();
		inOrder(a, 0);
		System.out.println();
		postOrder(a, 0);
	}

}

