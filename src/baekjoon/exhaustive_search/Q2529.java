package baekjoon.exhaustive_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//�ε�ȣ
//����
//��Ʈ��ŷ
public class Q2529 {
	static List<String> list = new ArrayList<>();
	
	public static boolean check(String key, String [] s) { //�ε�ȣ�� �����ϴ� �� üũ�ϴ� �޼ҵ�
		for(int i=1; i<key.length(); i++) {
			if(s[i-1].equals("<")) {
				if(!(key.charAt(i-1)-'0' < key.charAt(i)-'0')) {
					return false;
				}
			}
			else {
				if(!(key.charAt(i-1)-'0' > key.charAt(i)-'0')) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void go(String[] s, boolean [] visited, String key, int size){
		if(key.length() == size) {
			if(check(key, s)) {
				list.add(key);
			}
			return;
		}
		if(key.length() > size )
			return;
		for(int i=0; i<=9; i++) {
			if(!visited[i]) {
				visited[i] = true;
				go(s, visited, key+i, size);
				visited[i] = false; //��Ʈ��ŷ�� ����..
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String [] s = scan.nextLine().split(" ");
		boolean [] visited = new boolean[10];
		
		go(s,visited, "", n+1);
		
		System.out.println(list.get(list.size()-1));
		System.out.println(list.get(0));
	}

}
