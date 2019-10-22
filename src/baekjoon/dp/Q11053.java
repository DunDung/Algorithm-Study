package baekjoon.dp;

import java.util.Arrays;
import java.util.Scanner;

//���� �� �����ϴ� �κ� ����
//X
public class Q11053 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []a = new int[n];
		int []dp = new int[n];
		
		for(int i=0; i<n; i++)
			a[i] = scan.nextInt();
		
		for(int i = 0; i<n; i++) {
			dp[i] = 1;
			for(int j=0; j<i; j++)
				if(a[i]>a[j] && dp[i]<=dp[j]) 
					dp[i] = dp[j]+1;
		}
		Arrays.sort(dp);
		System.out.println(dp[n-1]);
			
	}

}
