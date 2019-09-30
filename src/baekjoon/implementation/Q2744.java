package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//��ҹ��� �ٲٱ�
public class Q2744 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		//'A' 65�� 'a' 97�� ���̴� 32�̴�. ' ' -> 32
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c>='A' && c<='Z') {
				sb.append((char)(c+' '));
			} else {
				sb.append((char)(c-' '));
			}
		}
		System.out.println(sb.toString());
		
	}

}
