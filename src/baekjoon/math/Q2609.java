package baekjoon.math;

import java.util.Scanner;

//�ִ������� �ּҰ����
public class Q2609 {
	static int gcd(int a, int b) {
		if(b==0)
			return a;
		return gcd(b, a%b);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int gcd = gcd(a, b);
		int lcm = (a*b/gcd); //�ּ� ����� ���ϱ�
		System.out.println(gcd);
		System.out.println(lcm);
		
	}

}
