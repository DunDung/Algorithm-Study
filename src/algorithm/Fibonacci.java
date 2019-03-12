package algorithm;

//�Ǻ���ġ ����
//�׳ɹ����� �������α׷��� ����

public class Fibonacci {
	static int [] a = new int[100];
	static int fibonacci(int n) { //�׳� ����
		if(n==1||n==2)
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}
	static int fibonacciVerDynamic(int n) { //�������α׷��� ����
		if(a[n] != 0) 
			return a[n];
		if(n==1||n==2)
			a[n]=1;
		else
			a[n] = fibonacciVerDynamic(n-1)+fibonacciVerDynamic(n-2);
		return a[n];
	}
	

	public static void main(String[] args) {
		System.out.println(fibonacci(40));
		System.out.println(fibonacciVerDynamic(40));
	}

}
