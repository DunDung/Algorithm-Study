package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//K��° ��
//������� ū ���������� Scanner�� ���� �������.
//StringTokenizer�� �������. ���ٸ��� new ����� �Ѵ�.
//X
public class Q11004 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		int n = Integer.parseInt(st.nextToken()); 
		int k = Integer.parseInt(st.nextToken()); 
		int [] array = new int[n];
		
		st = new StringTokenizer(reader.readLine());
		for(int i=0; i<n; i++)
			array[i] = Integer.parseInt(st.nextToken());
		Arrays.parallelSort(array);
		System.out.println(array[k-1]);
		
	}

}