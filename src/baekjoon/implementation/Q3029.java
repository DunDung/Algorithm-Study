package baekjoon.implementation;

import java.util.Date;
import java.util.Scanner;

// ���
public class Q3029 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] now = scanner.nextLine().split(":");
		String[] target = scanner.nextLine().split(":");
		int[] answer = new int[3];
		int carry = 0;
		
		for (int i = 2; i >= 0; i--) {
			int k = (Integer.parseInt(target[i]) + carry) - Integer.parseInt(now[i]);
			if(k < 0) {
				if(i == 0) {
					k+=24;
				} else {
					k += 60;
					carry = -1;
				}
			} else {
				carry = 0;
			}
			answer[i] = k;
		}
		
		if(answer[0] == 0 && answer[1] == 0 && answer[2] == 0) { //�ּ� 1�ʴ� ��ٸ��� ������ 24�ð��� ��ٷ����ϴ� ��.
			answer[0] = 24;
		}
		for (int i = 0; i < 3; i++) {
			if(answer[i] < 10) {
				System.out.print(0);
			}
			System.out.print(answer[i]);
			if(i != 2) {
				System.out.print(":");
			}
		}
	}
}
