package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//���Ի��
//X
public class Q1946 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(reader.readLine());

		while(tc-- > 0) {
			int n = Integer.parseInt(reader.readLine());
			int [] a= new int[n+1];

			for(int i=0; i<n; i++) {
				StringTokenizer st = new StringTokenizer(reader.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				a[x] = y;
			}
			
			int cnt = 1; //x�� 1�϶��� ������ �����ϹǷ� 1�� ����
			int standard = a[1]; //���� ��, ó������ x�� 1�� ���� y��
			for(int i=2; i<=n; i++) {
				if(standard > a[i]) { //���� ������ a[i]�� y���� �۴ٸ� 
					cnt++; //�߰�
					standard = a[i]; //���� �� a[i]�� y������ ����
				}
			}
			System.out.println(cnt);
		}
	}
}

