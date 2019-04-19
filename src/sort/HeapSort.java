package sort;

import java.util.Arrays;

//������
//�� -> �ִ����� ��� ��尡 �ڽĳ�� ���� ���� Ŀ���Ѵ�.
//���� ������ ����� ���� ��Ʈ��忡 �ִ� �ִ밪�� ���� ����
public class HeapSort {
	static void swap(int [] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	static void buildHeap(int [] a) {
		int end = a.length-1;
		for(int i = end/2; i>=0; i--) {
			heapify(a, i, end);
		}
			
	}
	static void heapify(int [] a, int k, int end) {
//		System.out.println("heapify("+k+" "+end+")");
//		System.out.println(Arrays.toString(a));
		int left = 2*k+1, right = 2*k+2;
		int biger;
		if(right <= end)
			biger = (a[left] > a[right]) ? left : right;
		else if(left<=end)biger = left;
		else return;
		if(a[biger] > a[k]) {
			swap(a, biger, k);
			heapify(a, biger, end);
		}
	}
	static void heapSort(int [] a) {
		buildHeap(a);
		for(int end = a.length-1; end>=1; --end) {
			swap(a, 0 ,end);
			heapify(a,0,end-1);
		}
	}

	public static void main(String[] args) {
		int [] example = {8,3,6,1,4,2};
		heapSort(example);
		System.out.println(Arrays.toString(example));
	}

}
