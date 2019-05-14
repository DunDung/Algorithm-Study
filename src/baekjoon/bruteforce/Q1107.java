package baekjoon.bruteforce;

import java.util.Scanner;

//������
//X
public class Q1107 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		int m = scan.nextInt();
		int [] a = new int[10]; //���峭 ��ư�� ǥ���� �迭
		
		for(int i=0; i<m; i++)  //���峭 ��ư�� -1�� �ִ´�.
			a[scan.nextInt()] = -1;

		if(n.equals("100")) 
			System.out.println(0);
		else {
			int min = Integer.MAX_VALUE;
			String v = "";//0 ~ 1000000������ ���ڸ� ���ڿ�ȭ �ϱ�����~
			String closer = ""; //���������� �Է��� �� �ִ� n�� ���� ����� ä��
			
			for(int i = 0; i<1000000; i++) {
				boolean isOk = true;
				v = i+""; //���ڸ� ���ڿ��� ����
				for(int j=0; j<v.length(); j++) { //���峭 ��ư�� ���ԵǾ� �ִ��� �˻�
					if(a[v.charAt(j)-'0'] == -1) { 
						isOk = false;
						break;
					}
				}
				if(isOk) { //v�� ���峭 ��ư�� ������ ���� ����� ä���� ã�´�. n-v��  + �Ǵ� - ��ư�� ��� �������ϴ��� ���
					if(min > Math.abs(Integer.parseInt(n)-Integer.parseInt(v))) { 
						min = Math.abs(Integer.parseInt(n)-Integer.parseInt(v));
						closer = v; 
					}
				}
			}
			
			int result1 = Math.abs(Integer.parseInt(n)-100); //result1���� ����ä���� 100���� +��-������ n���� ������ Ƚ���� ����
			if(closer.equals("")) //���� ����� ���� ��������� �׳� result1���
				System.out.println(result1);
			else { //result2���� n-closer�� closer���� n���� �������� Ƚ���� closer�� ���������� ��ư �Է� Ƚ���� closer�� ���̸� ���Ѵ�.
				int result2 = Math.abs(Integer.parseInt(n)-Integer.parseInt(closer))+closer.length(); 
				if(result1>result2)
					System.out.println(result2);
				else
					System.out.println(result1);
			}
		}
	}
}
