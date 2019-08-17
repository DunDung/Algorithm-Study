package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//����� �賶
//1���� dp�� �̿�
//������
//X
public class Q12865_ver2 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] input = in.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]); 

		int[] w = new int[n+1]; //����
		int[] value = new int[n+1]; //��ġ
		int[] dp = new int[k+1];

		for(int i=1; i<=n; i++) {
			input = in.readLine().split(" ");
			w[i] = Integer.parseInt(input[0]);
			value[i] = Integer.parseInt(input[1]);
		}


		for(int i=1; i<=n; i++) {
			for(int j=k; j-w[i]>=0;j--) {
				dp[j]=Math.max(dp[j],dp[j-w[i]]+value[i]);
			}
		}
		System.out.println(dp[k]);
	}
}