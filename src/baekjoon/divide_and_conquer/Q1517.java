package baekjoon.divide_and_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�����Ʈ
//������Ʈ�� Ȱ���ؾ��Ѵ�.
//X
public class Q1517 {
	public static long solve(int[] a, int start, int end) {
		if (start == end) {
			return 0;
		}
		int mid = (start+end)/2;
		int[] b = new int[end-start+1];
		long ans = solve(a, start, mid) + solve(a, mid+1, end);
		{
			int index1 = start; //�պκ� �ε���
			int index2 = mid+1; //�޺κ� �ε���
			int k = 0;
			while (index1 <= mid || index2 <= end) { // &&�� �ƴ� ||�� while�� �ϳ��� ó��
				//index2 > end || ->�� �պκп� �������� ��츦 ó��
				if (index1 <= mid && (index2 > end || a[index1] <= a[index2])) { 
					b[k++] = a[index1++];
				} else {
					ans += (long)(mid-index1+1); //������ ����ŭ ����
					b[k++] = a[index2++];
				}
			}
		}
		for (int i=start; i<=end; i++) {
			a[i] = b[i-start];
		}
		return ans;
	}
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int[] a = new int[n];
		String[] line = br.readLine().split(" ");
		for (int i=0; i<n; i++) {
			a[i] = Integer.valueOf(line[i]);
		}
		long ans = solve(a, 0, n-1);
		System.out.println(ans);
	}
}
