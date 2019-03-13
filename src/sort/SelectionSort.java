package sort;

import java.util.Arrays;

//���� ����
//���� ���� �� �Ǵ� ū���� ã�Ƽ� �����Ѵ�.
public class SelectionSort {

	static void swap(int [] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static int findMin(int [] a, int start) {
		int min = a[start];
		int index = start; //0���� �ʱ�ȭ�ؼ� �� �κп��� Ʋ�Ⱦ���. start�� ���� �ּҰ��� ���� ��� 0�� �����ؼ� 0�� �����߾���.. 

		for(int i=start+1; i<a.length; i++) {
			if(a[i] < min) {
				min = a[i];
				index = i;
			}
		}
		return index;
	}
	
	static void selectionSort(int [] a) {
		for(int i=0; i<a.length-1; i++) {
			int minIndex = findMin(a, i);
			swap(a, i, minIndex);
		}
	}
	
	public static void main(String[] args) {
		int [] example = {9, 3, 2, 4, 6, 7, 8, 1, 5};
		selectionSort(example);
		System.out.println(Arrays.toString(example));
	}

}
