package baekjoon.math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//�������� ����
public class Q9020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Boolean> list = new ArrayList<>();
		List<Integer>decimal = new ArrayList<>();
		List<Integer> answer = new ArrayList<>();
		
		list.add(false);
		list.add(false);
		//2~n���� �Ҽ��� ����
		for(int i=2; i<=5081; i++) 
			list.add(i, true);

		//2���� ~ i*i <= n ������ ������� ��������.
		for(int i=2; (i*i)<=5081; i++)
			if(list.get(i))
				for(int j=i*i; j<=5081; j+=i)
					list.set(j, false);

		for(int i=2; i<=5081; i++)
			if(list.get(i))
				decimal.add(i);

		int t =scan.nextInt();
		for(int i=0; i<t; i++) {
			int n=scan.nextInt();
			int a = n/2; int b = n/2;
		
			while(true) {
				if(decimal.contains(a)&&decimal.contains(b)&&a+b==n) {
					System.out.println(a+" "+b);
					break;
				}
				else {
					a--;
					b++;
				}				
			}
		}
	}
}
