package baekjoon.etc;
import java.util.Arrays;
import java.util.Scanner;

public class Q2750 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int []array = new int[n];
		for(int i=0; i<n; i++) 
			array[i] = scan.nextInt();
		
		Arrays.sort(array);
		for(int x : array)
			System.out.println(x);
	}
}
