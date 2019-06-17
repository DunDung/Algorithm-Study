package baekjoon.exhaustive_search;

import java.util.Scanner;

//������
//X

public class Q2580_ver2 {
	static boolean [][] rowCheck = new boolean[9][10];
	static boolean [][] colCheck = new boolean[9][10];
	static boolean [][] squareCheck = new boolean[9][10];

	static int square(int x, int y) { //���° ���� �簢������ ���
		return (x/3)*3+y/3;
	}

	public static void go(int[][]a, int cnt) {
		if(cnt == 81) {
			for(int i=0; i<9; i++) {
				for(int j=0; j<9; j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.exit(0); //�� �̻� ��Ͱ� ���� �ʵ��� ���α׷� ����, ������ �ð��ʰ�
		}
		int x = cnt/9; //�� ���ϱ�
		int y = cnt%9; //�� ���ϱ�

		if(a[x][y] != 0) {
			go(a, cnt+1);
		}else {
			for(int k=1; k<=9; k++) {
				if(!rowCheck[x][k] && !colCheck[y][k] && !squareCheck[square(x,y)][k]) { //3���� ��� ��� k�� ���� ���
					rowCheck[x][k] = true;  //�ٽ� �湮���� �ʱ�����
					colCheck[y][k] = true;
					squareCheck[square(x,y)][k] = true;
					a[x][y] = k; //0�� k�� �ٲ�
					go(a, cnt+1); //���� �ܰ�
					//��Ʈ��ŷ�� ����
					a[x][y] = 0; 
					rowCheck[x][k] = false;
					colCheck[y][k] = false;
					squareCheck[square(x,y)][k] = false;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][] a = new int[9][9];
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				a[i][j] = scan.nextInt();
				if(a[i][j] != 0) {
					rowCheck[i][a[i][j]] = true;
					colCheck[j][a[i][j]] = true;
					squareCheck[square(i, j)][a[i][j]] = true;
				}
			}
		}
		go(a, 0);
	}

}
