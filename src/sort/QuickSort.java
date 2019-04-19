package sort;

import java.util.Arrays;

//������
//partition�� ���� ���ذ����� ���������� ������ ū������ �ڷ� ������ ���ذ��� ��ġ�� ���Ͻ�Ų��.
public class QuickSort {
	static void swap(int [] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static int partition(int [] a, int start, int end) {
		int value = a[end];
		int i = start -1;
		for(int j = start; j<=end-1; ++j) {
			if(a[j]<value)
				swap(a, ++i, j);
		}
		swap(a, i+1, end);
		return i+1;
	}

	static void quickSort(int [] a , int start, int end) {
		System.out.println("qs("+start+", "+end+")");
		if(start>=end) return;
		int middle = partition(a, start, end);
		System.out.println(middle);
		System.out.println(Arrays.toString(a));
		quickSort(a, start, middle-1);
		quickSort(a, middle+1, end);
	}
	public static void main(String[] args) {
		int [] example = {9, 7, 6, 8, 3, 4};
		quickSort(example, 0, example.length-1);
		System.out.println(Arrays.toString(example));
	}
	
}
