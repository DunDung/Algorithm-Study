package baekjoon.samsung;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//연구소
//남의 방식을 참조
//X
public class Q14502 {
	static int [] dx = {1, -1, 0, 0};
	static int [] dy = {0, 0, 1, -1};
	static int max = 0;
	
	public static int area(int[][]a) {
		Queue<Pos5> q = new LinkedList<>();
		int [][] clone = new int[a.length][a[0].length];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				clone[i][j] = a[i][j];
				if(a[i][j] == 2) {
					q.add(new Pos5(i, j));
				}
			}
		}
		
		while(!q.isEmpty()) {
			Pos5 p  = q.poll();
			int x = p.x;
			int y = p.y;
			
			for(int k=0; k<4; k++) {
				if(x+dx[k]>=0 && x+dx[k]<a.length) {
					if(y+dy[k]>=0 && y+dy[k]<a[0].length) {
						if(clone[x+dx[k]][y+dy[k]] == 0) {
							clone[x+dx[k]][y+dy[k]] = 2;
							q.add(new Pos5(x+dx[k], y+dy[k]));
						}
					}
				}
			}
		}
			
		int cnt = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				if(clone[i][j] == 0) {
					cnt++;
				}
			}
		}
		return cnt;
	}
	
	public static void backtrack(int [][] a, int index, int cnt) {
		if(cnt == 3) {
			max = Math.max(max, area(a));
			return;
		}
		if(index == a.length * a[0].length) return;
		
		for(int i=index; i<a.length * a[0].length; i++ ) {
			int x = i / a[0].length;
			int y = i % a[0].length;
			if(a[x][y] == 0) {
				a[x][y] = 1;
				backtrack(a, i+1, cnt+1);
				a[x][y] = 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int [][] a = new int[n][m];
		boolean [][] b = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		backtrack(a, 0, 0);
		System.out.println(max);
		
	}
}
class Pos5 {
	int x;
	int y;
	
	public Pos5(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
