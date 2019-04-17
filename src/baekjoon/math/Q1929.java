package baekjoon.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1929 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m =scan.nextInt();
		int n =scan.nextInt();
		
		List<Boolean> list = new ArrayList<>();
		list.add(false);
		list.add(false);
		
		//2~n���� �Ҽ��� ����
		for(int i=2; i<=n; i++) 
			list.add(i, true);
		
		//2���� ~ i*i <= n ������ ������� ��������.
		for(int i=2; (i*i)<=n; i++)
			if(list.get(i))
				for(int j=i*i; j<=n; j+=i)
					list.set(j, false);
		
		for(int i=m; i<=n; i++){
			if(list.get(i))
				System.out.println(i);
		}
	}
}
