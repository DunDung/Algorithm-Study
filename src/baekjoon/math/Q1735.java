package baekjoon.math;

import java.util.Scanner;

//�м� ��
//��Ŭ���� ȣ����
public class Q1735 {
	static int gcd(int a, int b) { //��Ŭ����ȣ������ �ִ����� ���ϱ�
		if(b==0)
			return a;
		return gcd(b, a%b);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		int downGcd = b*d/gcd(b, d); //�и���� �ִ�����
		a *= downGcd/b; //���� * (�ּҰ����/�и�)
		c *= downGcd/d;
		
		int up = a+c; //���� ����
		int down = downGcd; //���� �и�
		
		int sumGcd = gcd(up, down); //������ �и�, ������ �ִ����� ���ϱ� 
		up /= sumGcd; //���� �ִ������� ������
		down /= sumGcd;
		System.out.println(up+" "+down);
	}

}
