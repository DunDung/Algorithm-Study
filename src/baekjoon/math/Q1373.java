package baekjoon.math;

import java.util.Scanner;

//2���� 8����
//X
public class Q1373 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
        int n = s.length();
        if (n%3 == 1) { //�� �ڸ��� ������ �� �� �տ� �� �ڸ��� ���°��
            System.out.print(s.charAt(0));
        } else if (n%3 == 2) { //�� �ڸ��� ���°��
            System.out.print((s.charAt(0)-'0')*2 + (s.charAt(1)-'0'));
        }
        //������ ���
        for (int i=n%3; i<n; i+=3) { 
            System.out.print((s.charAt(i)-'0')*4 + (s.charAt(i+1)-'0')*2 + (s.charAt(i+2)-'0'));
        }
	}
}
