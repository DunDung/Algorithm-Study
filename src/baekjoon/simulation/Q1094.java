package baekjoon.simulation;

import java.util.Scanner;

//�����
//���� ���ذ� �� ������� ����
public class Q1094 {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = 64;
		int sum = n;
		int cnt = 1; //������ ����

		while(sum != x) {
			cnt++; //�߶����ϱ� �߰�
			n /= 2;
			if(sum-n >= x) { //�ϳ� ������ ���� ���̰� x���� ũ�ų� ���ٸ�
				sum -= n; //�տ��� ���ְ�
				cnt--; //���� ���� ����
			}
		}
		System.out.println(cnt);
	}

}
