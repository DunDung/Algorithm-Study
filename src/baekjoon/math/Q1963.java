package baekjoon.math;

import java.util.ArrayList;
import java.util.List;

//�Ҽ� ���
//�ǳ� ��Դ� �����佺�׳׽��� ü
public class Q1963 {

	public static void main(String[] args) {
		List<Boolean> list = new ArrayList<>();
		
		list.add(false); //0
		list.add(false); //1
		for(int i=2; i<10000; i++)
			list.add(true);
		
		for(int i=2; i*i<10000; i++) {
			if(list.get(i))
				for(int j=i*i; j<10000; j+=i) { //����ϱ� j+=i�̴�.
					list.set(j, false);
				}
		}
		for(int i=2; i<10000; i++) {
			if(list.get(i))
				System.out.print(i+" ");
		}
	}
	���߿�...bfs�̿�
}