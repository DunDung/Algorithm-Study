package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2960 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		List<Boolean> list = new ArrayList<>();

		int n =scan.nextInt();
		int k = scan.nextInt();
		//0,1�� �Ҽ��� �ƴ����� ó��
		list.add(false);
		list.add(false);

		//2~n���� �Ҽ��� ����
		for(int i=2; i<=n; i++) 
			list.add(i, true);

		//2���� ~ i*i <= n ������ ������� ��������.
		int count = 0;
		for(int i=2; i<=n; i++) {
			if(list.get(i)) {
				count++;
				if(k==count) {
					System.out.println(i);
				}

				for(int j=i*i; j<=n; j+=i) {
					if(list.get(j)) {
						list.set(j, false);
						count ++;
						if(k==count) {
							System.out.println(j);

						}
					}
				}
			}
		}
	}
}