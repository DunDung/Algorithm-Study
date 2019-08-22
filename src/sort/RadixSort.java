package sort;

import java.util.Arrays;

//�������
//�񱳿��� x ���������ִ�
//�ڿ����� ���ĺ��� ��쿣 �ſ� ������.
//�ε��Ҽ��� �Ǽ����� �񱳴� ���Ѵ�.
//nũ���� �޸� ����.
public class RadixSort {

	static int getMax(int a[]) { 
		int max = a[0]; 
		for (int i = 1; i < a.length; i++) 
			if (a[i] > max) 
				max = a[i]; 
		return max; 
	} 

	static void countSort(int a[],  int exp) 
	{ 
		int output[] = new int[a.length];  
		int count[] = new int[10]; 

		for (int i = 0; i < a.length; i++) //�� �ڸ����� �°� ī����
			count[ (a[i]/exp)%10 ]++; 

		for (int i = 1; i < 10; i++) //������
			count[i] += count[i - 1]; 

		for (int i = a.length - 1; i >= 0; i--) 
			output[--count[(a[i]/exp)%10]] = a[i];  //countingSortó�� �������� �������� �ε����� ã�ư���.
			 
		for (int i = 0; i < a.length; i++) //a�� ��� �ٲ������ν� ���迭�� �������� �Ѵ�.
			a[i] = output[i]; 
	} 

	static void radixSort(int a[]) 
	{ 
		int m = getMax(a); 

		for (int exp = 1; m/exp > 0; exp *= 10) 
			countSort(a, exp); 
	} 


	public static void main(String[] args) {
		int [] example = {9, 3, 2, 4, 6, 7, 8, 1, 5};
		radixSort(example);
		System.out.println(Arrays.toString(example));
	}

}
