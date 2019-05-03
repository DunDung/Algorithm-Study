package baekjoon.math;

import java.util.Scanner;

//�м� ��
//��Ŭ���� ȣ����
public class Q1735 {
	static long gcd(long a, long b) { //��Ŭ����ȣ������ �ִ����� ���ϱ�
		if(b==0)
			return a;
		return gcd(b, a%b);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		long d = scan.nextLong();
		
		long downGcd = b*d/gcd(b, d); //�и���� �ִ�����
		a *= downGcd/b; //���� * (�ּҰ����/�и�)
		c *= downGcd/d;
		
		long up = a+c; //���� ����
		long down = downGcd; //���� �и�
		
		long sumGcd = gcd(up, down); //������ �и�, ������ �ִ����� ���ϱ� 
		up /= sumGcd; //���� �ִ������� ������
		down /= sumGcd;
		System.out.println(up+" "+down);
	}

}
