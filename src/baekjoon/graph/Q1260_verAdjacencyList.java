package baekjoon.graph;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//DFS�� BFS
//���� ����Ʈ�� �׷��� ����
//DFS, BFS ����� �����ʾ� ���� �� Ǯ��
public class Q1260_verAdjacencyList {
	static void dfs(List<Integer> [] list, boolean [] b, int v) {
		if(b[v])
			return;
		b[v] = true;
		System.out.print(v+" ");

		for(int n : list[v])
			if(!b[n])
				dfs(list, b, n);
	}

	static void bfs(List<Integer>[] list, boolean [] b, int v) {
		Queue<Integer> q = new LinkedList<>();

		q.offer(v);
		b[v] =true;

		while(!q.isEmpty()) {
			v = q.poll(); //v�� poll�� �ȳ־��༭ Ʋ�Ⱦ��� v�� poll�� ����� ���� ��带 �ٽ� for�� ������..
			System.out.print(v+" ");

			for(int n : list[v])
				if(!b[n]) {
					q.offer(n);
					b[n] = true;
				}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int v = scan.nextInt();
		boolean [] b = new boolean[n+1];
		List<Integer> [] list = (List<Integer>[]) new LinkedList[n+1];

		for(int i=0; i<n+1; i++)
			list[i] = new LinkedList<>();

		for(int i=0; i<m; i++) {
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			list[v1].add(v2);
			list[v2].add(v1);
		}
		
		for(int i=0; i<n+1; i++) //���ľ��ؼ� Ʋ�Ⱦ���.
			Collections.sort(list[i]); //�湮�� �� �ִ� ������ �������� ��� ���� ���� �ͺ��� �湮�ؾ� �ϱ� ������ sort
		
		dfs(list, b, v);
		Arrays.fill(b, false);//Ʋ�Ⱦ���. dfs�� �����ϸ� �ٲ� boolean�迭�� �ٽ� false�� �ʱ�ȭ 
		System.out.println();
		bfs(list, b, v);

		scan.close();
	}

}
