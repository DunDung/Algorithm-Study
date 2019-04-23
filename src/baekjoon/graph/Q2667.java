package baekjoon.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//������ȣ���̱�
//�ѵ�
public class Q2667 {
	static int [][] a; //�Է� ���� �迭
	static boolean [][] b; //�湮���� �迭
	static int cnt2; //���� �� ���� ����

	static void dfs(int i, int j) {
		if(b[i][j])
			return;

		b[i][j] = true;
		cnt2 ++; //������ ����

		//������ ũ�� üũ, �����ִ��� üũ, �湮�ߴ� ������ üũ
		if(i-1 >= 0 && a[i-1][j] > 0 && !b[i-1][j]) //�Ʒ� �� 
			dfs(i-1, j);
		if(i+1 < a.length && a[i+1][j] > 0 && !b[i+1][j]) //�� ��
			dfs(i+1, j);
		if(j-1 >= 0 && a[i][j-1] > 0 && !b[i][j-1]) //���� ��
			dfs(i, j-1);
		if(j+1 < a.length && a[i][j+1] > 0 && !b[i][j+1]) //������ ��
			dfs(i, j+1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		a = new int[n][n];
		b = new boolean[n][n];
		int cnt = 0;
		List<Integer> list = new ArrayList<>();

		for(int i=0; i<n; i++) {
			String s = scan.next();
			for(int j=0; j<n; j++) 
				a[i][j] = Integer.parseInt(s.substring(j, j+1));
		}

		for(int i=0; i<n; i++) 
			for(int j=0; j<n; j++) 
				if(a[i][j] > 0 && !b[i][j]) {
					cnt++; //���� �� ����
					cnt2 = 0; //������ �ʱ�ȭ
					dfs(i, j);
					list.add(cnt2); // ������ ����
				}

		System.out.println(cnt); //������ ���
		Collections.sort(list); //������ �������� ����
		for(int m : list)
			System.out.println(m);
	}
}
