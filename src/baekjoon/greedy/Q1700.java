package baekjoon.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//��Ƽ�� �����ٸ�
//x
public class Q1700 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int [] a = new int[m];
		int [] how = new int[101];//��� �����ϴ��� 

		for(int i=0; i<m; i++) {
			a[i] = scan.nextInt();
			how[a[i]]++;
		}

		int ans = 0;
		List<Integer>list = new ArrayList<>();

		for(int i=0; i<m; i++) {
			how[a[i]]--; //���� Ƚ�� ����

			if(list.contains(a[i]))	continue; //�̹� ���������� continue

			if(list.size()>=n) { //���ߵ� �� 
				ans++;
				boolean ok = false; //���� ����
				for(int j=0; j<list.size(); j++) { //������ ������� �ʴ� �� ã��
					if(how[list.get(j)] <= 0) { //���� Ƚ���� 0���� ������ ������ �ȳ���
						list.remove(new Integer(list.get(j)));
						ok = true; 
						break;
					}
				}
				if(!ok) { //������ ������� �ʴ� ���� ���� �� ���� ���߿� �����ϴ� ���� �����
					boolean [] b = new boolean[n]; //���߿� �������� ���� üũ�� �迭
					int check = n;
					loop:{ 
						for(int j=i+1; j < m; j++) { 
							for(int k=0; k<n; k++) {
								if(list.get(k) == a[j] && !b[k]) {
									b[k] = true;
									check --;
									if(check == 0) { //���������� ���������� �����
										list.remove(new Integer(a[j]));
										break loop;
									}
									break;
								}
							}
						}
					}
				}
			}
			list.add(a[i]);
		}
		System.out.println(ans);
	}
}
