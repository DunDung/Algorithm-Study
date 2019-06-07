package baekjoon.exhaustive_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//�ζ�	
//X
public class Q6603 {
	public static void swap(List<Integer> a, int i, int j) {
		int temp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, temp);
	}

	public static boolean nextPermutation(List<Integer> a) { //���� ���� ���ϱ�
		int i = a.size()-1;
		while(i > 0 && a.get(i) <= a.get(i-1))
			i--;

		if(i < 1)
			return false;

		int j = a.size()-1;
		while(a.get(j) <= a.get(i-1))
			j--;

		swap (a, i-1, j);

		j = a.size()-1;
		while(i < j) {
			swap(a, i , j);
			i++;
			j--;
		}
		return true;

	}
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		while (true) {
			int n = scan.nextInt();
			if (n == 0) {
				break;
			}
			int []a = new int[n];
			for (int i=0; i<n; i++) {
				a[i] = scan.nextInt();
			}
			List<Integer> d = new ArrayList<>(); //���� �迭
			for (int i=0; i<n-6; i++) {
				d.add(0);
			}
			for (int i=0; i<6; i++) {
				d.add(1);
			}
			List<List<Integer>> ans = new ArrayList<>(); //���� �迭
			do {
				List<Integer> current = new ArrayList<>(); //�ӽ� �迭
				for (int i=0; i<n; i++) {
					if (d.get(i) == 1) {
						current.add(a[i]);
					}
				}
				ans.add(current);
			} while (nextPermutation(d));
			
			ans.sort((x, y) -> { //List<List<Integer> �� ���ٽ����� compareTo�� ������ �� ����
				int r = 0;
				for(int i=0; i<ans.size(); i++) {
					r = x.get(i)- y.get(i);
					if(r!=0)
						break;
				}
				return r;
			});
				
			for(List<Integer> k : ans) { //���
				for (int i=0; i<k.size(); i++) {
					System.out.print(k.get(i)+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}
}
