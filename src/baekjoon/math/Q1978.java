package baekjoon.math;

import java.util.Scanner;

//소수 찾기
//O
public class Q1978 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int count = 0;
		int n =scan.nextInt();

		for(int i=0; i<n; i++) {
			int x = scan.nextInt();
			boolean b = false;
			if(x==1) //1은 소수가 아니기 때문에 continue
				continue;
			for(int j=2; j*j<=x; j++) {
				if(x%j==0) {
					b = true;
					break;
				}
			}
			if(!b)
				count++;
		}
		System.out.println(count);
	}
}
