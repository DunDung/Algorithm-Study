package step_by_step;

import java.util.Scanner;

public class Q9498 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n>=0 && n<=100) {
			if(n>=90)
				System.out.println("A");
			else if(n>=80)
				System.out.println("B");
			else if(n>=70)
				System.out.println("C");
			else if(n>=60)
				System.out.println("D");
			else
				System.out.println("F");
		}
	}
}
