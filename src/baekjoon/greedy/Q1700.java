package baekjoon.greedy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//��Ƽ�� �����ٸ�
//x
public class Q1700 {
	����
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int [] a = new int[m];
		int [] k = new int[101];
		int cnt = 0;

		for(int i=0; i<m; i++) {
			a[i] = scan.nextInt();
			k[a[i]]++;
		}

		List<Integer>list = new ArrayList<>();
		for(int i=0; i<m; i++) {
			k[a[i]]--;
			if(list.contains(a[i])) {
				continue; //�̹� ���������� continue
			}
			if(list.size()>=n) { //���ߵ� �� 
				boolean ok = false; //���� ����
				for(int j=0; j<list.size(); j++) { //������ ������� �ʴ� �� ã��
					if(k[list.get(j)] <= 0) {
						list.remove(new Integer(list.get(j)));
						cnt++;
						ok = true; 
						break;
					}
				}
				if(!ok) { //������ ������� �ʴ� ���� ���� ��
					for(int j=m-1; j > i; j--) { //���� ���߿� ����ϴ� �� ã��
						if(list.contains(a[j])){
							list.remove(new Integer(a[j]));
							cnt++;
							break;
						}
					}
				}
			}
			list.add(a[i]);
		}
		System.out.println(cnt);
	}
}
