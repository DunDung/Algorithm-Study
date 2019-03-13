package sort;

import java.util.Arrays;
//��������
//0~i-1���̿��� value���� ū������ �ڷ� �о�� �о���� �տ� value�� �����Ѵ�.
//�������� �����߿��� ���� ��ƴ�.
public class InsertionSort {
	
	static void insertionSort(int [] a) {
		for(int i=1; i<a.length; i++) {
			int value = a[i];
			int j;
			for(j=i-1; j>=0; j--) //j--�� ���� �������� value���� ������ ���߱⿡ ������ ��ġ�� value�� �� ���� �� �ִ�.
				if(a[j]>value)
					a[j+1] = a[j];
				else
					break;
			a[j+1] = value; //j���� --�Ǹ鼭 for���� ���������� ������ j+1
		}
	}
	
	public static void main(String[] args) {
		int [] example = {9, 3, 2, 4, 6, 7, 8, 1, 5};
		insertionSort(example);
		System.out.println(Arrays.toString(example));
	}

}
