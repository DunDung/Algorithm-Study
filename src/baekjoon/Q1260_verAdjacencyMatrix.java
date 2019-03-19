package baekjoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//DFS�� BFS
//���� ��ķ� �׷��� ����
//������ n���� �ٵ��ƾ��ϹǷ� ���� ����Ʈ�� �� ȿ�����̶�� �� �� ����
public class Q1260_verAdjacencyMatrix {
	static void dfs( int[][] graph, boolean [] b, int v) {
		b[v] = true;
		System.out.print(v+" ");
		for(int i=1; i<graph.length; i++)
			if(graph[v][i]==1 && !b[i])
				dfs(graph, b, i);
	}

	static void bfs(int[][] graph, boolean [] b, int v) {
		Queue<Integer> q = new LinkedList<>();

		q.offer(v);
		b[v] =true;

		while(!q.isEmpty()) {
			v = q.poll(); //v�� poll�� �ȳ־��༭ Ʋ�Ⱦ��� v�� poll�� ����� ���� ��带 �ٽ� for�� ������..
			System.out.print(v+" ");

			for(int i=1; i<graph.length; i++)
				if(graph[v][i]==1 && !b[i]) {
					q.offer(i);
					b[i] = true;
				}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int v = scan.nextInt();
		boolean [] b = new boolean[n+1];
		int [][] graph = new int[n+1][n+1];

		for(int i=0; i<m; i++) {
			int v1 = scan.nextInt();
			int v2 = scan.nextInt();
			graph[v1][v2] = 1;
			graph[v2][v1] = 1;
			
		}
		
		dfs(graph, b, v);
		Arrays.fill(b, false);//Ʋ�Ⱦ���. dfs�� �����ϸ� �ٲ� boolean�迭�� �ٽ� false�� �ʱ�ȭ 
		System.out.println();
		bfs(graph, b, v);

		scan.close();
	}

}
