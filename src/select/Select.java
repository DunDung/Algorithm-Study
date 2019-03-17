package select;

import java.util.Arrays;
//partition�� ���� select
//partition�� O(n)
//select������ ���ʹ迭�� �ٽ� ����ص� ���ʹ迭�� ������ �����ϱ� ������ �������� �پ���.
//�迭�� ũ�Ⱑ 1�� �پ�� �� ���� ��� �۾��� ũ�⸦ ���ص� 10n �����̴�
//��� O(n)
//�־��� ��쿣 O(n2)�̴�. ���  ũ�Ⱑ n-1�� �پ�� ��쿣 ���������� �پ���. ����=1
public class Select {
	static void swap(int [] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	static int partition(int [] a, int start, int end) {
		int value = a[end];
		int i = start -1;
		for(int j=start; j<end; j++)
			if(a[j] < value)
				swap(a, ++i, j);
		swap(a, ++i, end);
		return i;
	}
	static int select(int [] a, int start, int end, int nth) {
		if(start>=end) return a[start];
		int middle = partition(a, start, end);
		int middle_nth = middle-start+1;
		if(middle_nth == nth)
			return a[middle];
		if(middle_nth > nth)
			return select(a, start, middle-1, nth);
		else
			return select(a, middle+1, end, nth-middle_nth);
	}
	public static void main(String[] args) {
		int [] example = {9, 3, 2, 4, 6, 7, 8, 1, 5, 20, 11, 13, 14, 12, 13, 28};
		System.out.println(select(example, 0, example.length-1, 11));
	}

}
