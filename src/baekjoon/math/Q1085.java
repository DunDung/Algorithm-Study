package baekjoon.math;

import java.util.Scanner;

//���簢������ Ż��
//x
public class Q1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		if(w-x < x) //x���� w�� ���°Ÿ��� x���� ���� ���� 0 ���� ���°ź��� ����� ��츸
			x = w-x;
		if(h-y < y) 
			y = h-y;
		//x��y���� w��h�� ���� �ͺ��� x�� y���� ���� ������ 0�� ���� ���� ���� �� ���� �� ���ִٴ� ��츦 ������� �ʾƼ� Ʋ�Ⱦ���.
		System.out.println(Math.min(x,y));
	}
}
