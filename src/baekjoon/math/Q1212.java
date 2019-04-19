package baekjoon.math;

import java.util.Scanner;

//8���� 2����
//X
public class Q1212 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 String[] eight = {"000","001","010","011","100","101","110","111"};
	        String s = scan.nextLine();
	        boolean start = true;
	        if (s.length() == 1 && s.substring(0, 1).equals("0")) { //�Է¹��� ���� 0�� ���
	            System.out.print(0);
	        }
	        for (int i=0; i<s.length(); i++) {
	            int n = Integer.parseInt(s.substring(i,i+1)); 
	            if (start == true && n < 4) { //ù��° �ڸ��� && 3�ڸ��� �ƴ� 2���� �϶�
	                if (n == 0) {
	                    continue;
	                } else if (n == 1) { 
	                    System.out.print("1");
	                } else if (n == 2) {
	                    System.out.print("10");
	                } else if (n == 3) {
	                    System.out.print("11");
	                }
	                start = false;
	            } else {
	                System.out.print(eight[n]);
	                start = false;
	            }
	        }
	    }
}