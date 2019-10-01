package baekjoon.implementation;

import java.io.*;

//����Լ��� ������?
public class Q17478 {
	static BufferedWriter bw;
	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(br.readLine());
		bw.write("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.\n");
		go("", 0);
		bw.flush();
	}
	static void go(String s, int cnt) throws IOException {
		if(cnt == n) {
			bw.write(s+"\"����Լ��� ������?\"\n");
			bw.write(s+"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"\n");
			bw.write(s+"��� �亯�Ͽ���.\n");
			return;
		}
		bw.write(s+"\"����Լ��� ������?\"\n");
		bw.write(s+"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.\n");
		bw.write(s+"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.\n");
		bw.write(s+"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"\n");
		go(s+"____", cnt+1);
		bw.write(s+"��� �亯�Ͽ���.\n");
	}

}
