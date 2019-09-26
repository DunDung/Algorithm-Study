package math;

//��Ŭ���� ȣ����
//�ִ����� ���ϱ�
public class Euclidean {
	static int gcd1(int a, int b) { //��� ���
		if(b==0)
			return a;
		return gcd1(b, a%b);
	}
	
	static int gcd2(int a, int b) { //�ݺ��� ���
		while(b!=0) {
			int r = a%b;
			a=b;
			b=r;
		}
		return a;
	}
	public static void main(String[] args) {
		int a = 1000000000-1;
		int b = 1;
		b = gcd1(a, b);
		System.out.println(b);
	}

}
