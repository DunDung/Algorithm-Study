package baekjoon.divide_and_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//������ ����
//��� �ð� �ʰ��� ���� ���� ������ ����
//���ΰ� �޼ҵ带 �Դٰ����ϸ� �ð��� �� �ɸ��� �� ��.
//X
public class Q1780 {
	static void check(int[][]a, int x, int y, int n, int [] cnt) {
		boolean isOk = true;
		loop:
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(a[x+i][y+j] != a[x][y]) {
						isOk=false;
						break loop;
					}
				}
			}
		if(!isOk) {
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					check(a,  x+i*n/3, y+j*n/3, n/3, cnt);
				}
			}
		}
		else {
			cnt[a[x][y]+1] += 1;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int [][]a = new int[n][n];
        int[] cnt = new int[3];

		for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            for (int j=0; j<n; j++) {
                a[i][j] = Integer.valueOf(st.nextToken());
            }
        }
		
		check(a, 0, 0, n, cnt);
		for (int i=0; i<3; i++) {
            System.out.println(cnt[i]);
        }
	}
}