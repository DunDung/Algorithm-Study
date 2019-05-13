package baekjoon.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//NMK
//X
public class Q1201 {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        if (m+k-1 <= n && n <= m*k) { //�Ұ����� ���ǿ� ������� �ʴ� ���
            int[] a = new int[n];
            for (int i=0; i<n; i++) {
                a[i] = i+1;
            }
            ArrayList<Integer> group = new ArrayList<Integer>(); //�׷��� ��踦 ���� �迭
            group.add(0); //ù ������ ������ 0
            group.add(k); //�ϴ� k�� �ִ´�.
            n -= k;
            m -= 1;
            int groupSize = (m == 0) ? 1 : n/m;
            int r = (m == 0) ? 0 : n%m;
            for (int i=0; i<m; i++) {
            	int v = group.get(group.size()-1)+groupSize;
                if (r > 0) {
                	v++;
                    r -= 1;
                }
                group.add(v);
            }

            for (int i=0; i<group.size()-1; i++) {
                int begin = group.get(i);
                int end = group.get(i+1)-1;
                while (begin < end) {
                    int temp = a[begin];
                    a[begin] = a[end];
                    a[end] = temp;
                    begin += 1;
                    end -= 1;
                }
            }
            for (int i=0; i<a.length; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            System.out.println(-1);
        }
    }
}
