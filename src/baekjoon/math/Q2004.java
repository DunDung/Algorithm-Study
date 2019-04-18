package baekjoon.math;

import java.util.Scanner;

//���� 0�� ���� 
//���� ����  n!/m!(n!-m!)
//�����⿩�� �����...���
//X
public class Q2004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
        long m = scan.nextLong();
        long two = 0, five = 0;
        for (long i=2; i<=n; i*=2) { //n��ŭ �߰�
            two += n/i;
        }
        for (long i=2; i<=n-m; i*=2) { //n-m��ŭ ����
            two -= (n-m)/i;
        }
        for (long i=2; i<=m; i*=2) { //m��ŭ �� ����
            two -= m/i;
        }
        for (long i=5; i<=n; i*=5) {
            five += n/i;
        }
        for (long i=5; i<=n-m; i*=5) {
            five -= (n-m)/i;
        }
        for (long i=5; i<=m; i*=5) {
            five -= m/i;
        }
        System.out.println(Math.min(two,five));
    }

}
