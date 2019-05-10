package baekjoon.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//30
//X
//���� ���ظ� ����� ����
//�־��� ������ ������ ���� ū���� 30�� ������� �ƴ����� ã�´�.
//30�� ����̷��� ���ڸ��� 0���� �������ϰ� ���� 3�� ������� �Ѵ�.
public class Q10610 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		
		for(int i=0; i<s.length(); i++) {
			sum += s.charAt(i)-'0';
			list.add(s.charAt(i)-'0');
		}
		
		Collections.sort(list);
		if(list.get(0)==0 && sum %3 == 0) {//30�� ����� ������
			for(int i=list.size()-1; i>=0; i--)//���
				System.out.print(list.get(i));
		}
		else
			System.out.println(-1);
	}
}
