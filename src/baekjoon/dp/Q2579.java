package baekjoon.dp;

import java.util.Scanner;

//��ܿ�����
//X
public class Q2579 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] array = new int[n];
		int [] dp = new int[n];
		
		for(int i=0; i<n; i++) 
			array[i] = scan.nextInt();
		
		dp[0] = array[0]; //ù�� ° ���
		dp[1] = Math.max(array[1], dp[0]+array[1]); //�ι� ° ����� ù�� ° ��ܸ� �Ǵ� ù�� ° ��� + �ι� ° ���
		dp[2] = Math.max(array[0]+array[2], array[1]+array[2]); //���� ° ����� ù��° ��� + ����° ��� 
															//�Ǵ� �ι� ° ��� + ���� ° ���
		
		for(int i=3; i<n; i++) 
			dp[i] = Math.max(dp[i-2]+array[i], dp[i-3]+array[i-1]+array[i]);
			//���� ��� + ���� ��� �Ǵ� ������ ��� +�� ��� + ���� ���
		System.out.println(dp[n-1]);
	}
}
