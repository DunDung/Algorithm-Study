package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//����
//��Ʈ����ũ ������ ǯ
public class Q11723 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int m = Integer.parseInt(reader.readLine());
		int n = 0;
		
		for(int i=0; i<m; i++) {
			String[] s = reader.readLine().split(" ");
			int x = 0;
			if(s.length>=2) {
				x = Integer.parseInt(s[1]);
			}
			switch(s[0]) {
			case "add":
				n = n | (1<<--x); //0~n-1������ �ƴ� 1~n�� ���� x�� --���ش�.
				break;
			case "remove":
				n = n & ~(1<<--x);
				break;
			case "check":
				if((n & (1<<--x)) > 0)
					writer.write("1\n");
				else
					writer.write("0\n");
				break;
			case "toggle":
				n = n ^ (1<<--x);
				break;
			case "all":
				n = (1<<20)-1;
				break;
			case "empty":
				n = 0;
				break;
			}
		}
		writer.flush();
	}
}
