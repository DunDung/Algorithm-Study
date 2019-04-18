package baekjoon.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//�� �����ϱ�3
public class Q10989 {

	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter wt= new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(scan.readLine());
		int [] a = new int [n];
		for(int i =0; i<a.length; i++)
			a[i] = Integer.parseInt(scan.readLine());
	
		//ī��������
		int [] countArray = new int[10001]; //���� ū ���� ũ��� �ӽ� �迭�� �����.
		for(int i=0; i<a.length; i++) 
			countArray[a[i]]++; //�ӽ� �迭�� a[i]��° �ε��� ���� 1�� ������Ŵ.
		
		for(int i=1; i<countArray.length; i++)  //���� Ƚ���� ���������� �ٲ��ش�.
			countArray[i] = countArray[i-1]+countArray[i];
		
		int [] sortedArray = new int[a.length];
		for(int i=a.length-1; i>=0; i--) {
			sortedArray[countArray[a[i]]-1] = a[i];
			countArray[a[i]]--;
		}
		for(int z : sortedArray)
			wt.write(Integer.toString(z)+"\n");
		wt.flush();
	}

}
