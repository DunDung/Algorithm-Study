package baekjoon.stack;

import java.util.Scanner;
import java.util.Stack;

//��ȣ�� ��
//����� ����..
public class Q2504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		String s = scan.next();
		for(int i=0; i<s.length(); i++) {
			if(s.substring(i,i+1).equals("(")||s.substring(i,i+1).equals("[")) //( , [ �� push
				stack.push(s.substring(i,i+1));
			else if(s.substring(i, i+1).equals(")")||s.substring(i, i+1).equals("]")) { //),]�� ��
				if(stack.isEmpty()) //��������� break
					break;
				if(s.substring(i, i+1).equals(")")) { //()�� 2
					if(stack.peek().equals("(")) {
						stack.pop();
						stack.push("2");
					}
					else if(stack.peek().matches("[0-9]*")) {//)�� �� ���ÿ� ���ڰ� ������
						int sum = 0;
						while(true) {
							if(stack.isEmpty()) { //empty�� �߸��� ���� sum = 0
								sum = 0;
								break;
							}
							if(stack.peek().matches("[0-9]*")) { //���ڰ� ������ ��� ����
								sum += Integer.parseInt(stack.pop());
								continue;
							}
							if(stack.peek().equals("(")) { //(�� ������ ���Ѱ��� *2 
								stack.pop();
								sum*=2;
								break;
							}
							else { //if���� ������ �ٸ� ���̸� �߸��� ���� sum =0
								sum=0;
								break;
							}
						}
						if(sum==0) { //�߸��� ���̸� ������ ����� 0�� ����ϰ���
							stack.clear();
							break;
						}
						else { //���� ���̸� ���ÿ� ���Ѱ��� push
							stack.push(String.valueOf(sum));
							continue; //��� ����
						}
					}
				}

				else if(s.substring(i, i+1).equals("]")) {
					if(stack.peek().equals("[")) {
						stack.pop();
						stack.push("3");
					}
					else if(stack.peek().matches("[0-9]*")) {
						int sum = 0;
						while(true) {
							if(stack.isEmpty()) {
								sum = 0;
								break;
							}
							if(stack.peek().matches("[0-9]*")) {
								sum += Integer.parseInt(stack.pop());
								continue;
							}
							if(stack.peek().equals("[")) {
								stack.pop();
								sum*=3;
								break;
							}

							else {
								sum=0;
								break;
							}
						}
						if(sum==0) {
							stack.clear();
							break;
						}
						else {
							stack.push(String.valueOf(sum));
							continue;
						}
					}
				}
			}
		}
		
		int result = 0;
		while(true) {
			if(stack.isEmpty()) 
				break;
			if(stack.peek().matches("[0-9]*")) { //���ÿ� ���ڵ鸸 ���������� �� ����
				result += Integer.parseInt(stack.pop());
				continue;
			}
			else {
				result = 0;
				break;
			}
		}
		System.out.println(result);
		scan.close();
	}
}
