package baekjoon.math;

import java.util.Scanner;

//���μ� ����
//X
public class Q11653 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
	
		for(int i=2; i*i<=n; i++)
			while(n%i == 0) {
					System.out.println(i);
					n /= i;
				}
		
		if(n>1)//�μ��� ��Ʈn���� ū���
			System.out.println(n);
	}

}
