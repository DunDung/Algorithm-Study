package sort;

import java.util.Arrays;

//�������
//�����ð����� �˰���
//�������� ����
//���� ũ��Ŭ���� �޸𸮸� �����Ѵ�.

public class CountingSort {

	static void countingSort(int [] a) {
		int [] countArray = new int[a.length+1];
		int [] result = new int[a.length];
		
		for(int i=0; i<a.length; i++) //ī��Ʈ�迭�� �迭 a�� ���� �ε����� 1�� �����Ѵ�.
			countArray[a[i]]++;
		
		for(int i=1; i<countArray.length; i++) //�ε����� �ڷΰ����� ���� ���� ��Ų��.
			countArray[i]+=countArray[i-1];
		
		for(int i = result.length-1; i>=0; i--) //a�迭�� ������ �ε������� ���� ���� countArray �ε����� ���� ����-1�ϸ� 
			result[--countArray[a[i]]] = a[i]; //���ĵ� a[i]�� ������ �ε����� ���´�. --�������ν� countArray���� �ϳ� ���� -1���ϰ�
		
		System.out.println(Arrays.toString(result));
	}
	public static void main(String[] args) {
		int [] example = {9, 3, 2, 4, 6, 7, 8, 1, 5};
		countingSort(example);
	}

}
