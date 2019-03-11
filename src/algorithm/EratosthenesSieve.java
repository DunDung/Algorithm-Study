package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//�����佺�׳׽��� ü
public class EratosthenesSieve {
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		List<Boolean> list = new ArrayList<>();
		
		int n =scan.nextInt();
		
		//0,1�� �Ҽ��� �ƴ����� ó��
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
		
		for(int i=2; i<=n; i++)
			if(list.get(i))
				System.out.println(i+" ");
	}
}
