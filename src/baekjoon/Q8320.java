package baekjoon;

import java.util.Scanner;

public class Q8320 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = 0;

		for(int i=1;i<=n;i++) //1���� n������ ����
		    for(int j=i;i*j<=n;j++)//i*j<=n�̸� count�Ѵ�..
		    	count++;
		
		System.out.println(count);
	}

}
