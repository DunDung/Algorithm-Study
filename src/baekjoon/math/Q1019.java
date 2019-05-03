package baekjoon.math;

import java.util.Arrays;
import java.util.Scanner;

//å ������
//X
public class Q1019 {

	//�Ķ���ͷ� ���� x�� 10���� ������ �ڸ����� ���� ans�迭�� ���Ѵ�.
	public static void cal(int x, int[] ans, int point) {
		while (x > 0) {
			ans[x % 10] += point; 
			x /= 10; 
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ans = new int[10];
		int point = 1; //�ڸ���
		int start = 1;

		while (start <= n) {
			// n�� ���ڸ� 9�� �����
			while (n % 10 != 9 && start <= n) {
				cal(n, ans, point); //���ҽ�Ų n�� ans�迭�� ����Ƚ���� ������Ų��.
				n--; //n�� ���ҽ�Ű�鼭
			}

			if (n < start) {
				break;
			}

			// start�� ���ڸ� 0���� �����
			while (start % 10 != 0 && start <= n) {
				cal(start, ans, point);
				start++; //start�� ������Ű�鼭 10���� �����.
			}
			start /= 10;
			n /= 10;

			for (int i = 0; i < 10; i++) { //�ݺ��Ǵ� ����Ƚ���� �����ش�.
				ans[i] += (n - start + 1) * point;
			}
			point *= 10; //���� �ڸ����� �Ѿ�� ���� * 10�� ���ش�.
			System.out.println(n);
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(ans[i] + " ");
		}

	}
}



