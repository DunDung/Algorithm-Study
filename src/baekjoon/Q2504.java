package baekjoon;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Q2504 {//���ڸ����� �޼ҵ忡 �����Ķ���ͷ� ������ ó�� �� ����

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		String s = scan.next();
		for(int i=0; i<s.length(); i++) {
			System.out.println(stack.toString());
			if(s.substring(i,i+1).equals("(")||s.substring(i,i+1).equals("[")) //( , [ �� push
				stack.add(s.substring(i,i+1));
			else if(s.substring(i, i+1).equals(")")) { //)�� ��
				if(stack.isEmpty())
					break;
				if(stack.peek().equals("(")) {
					stack.pop();
					stack.push("2");
				}
				else if(stack.peek().matches("[0-9]*")) {
					while(true) {
						String num = stack.pop();
						if(stack.peek().equals("(")) {
							stack.pop();
							stack.push(String.valueOf(2*Integer.parseInt(num)));
							break;
						}	
						if(stack.peek().matches("[0-9]*")) 
							if(stack.size()!=1) 
								stack.push(String.valueOf(Integer.parseInt(stack.pop())+Integer.parseInt(num)));
					}	
				}
			}
			else if(s.substring(i, i+1).equals("]")) {
				if(stack.isEmpty())
					break;
				if(stack.peek().equals("[")) {
					stack.pop();
					stack.push("3");
				}
				else if(stack.peek().matches("[0-9]*")) {
					while(true) {
						String num = stack.pop();
						if(stack.peek().equals("(")) {
							stack.pop();
							stack.push(String.valueOf(2*Integer.parseInt(num)));
							break;
						}	
						if(stack.peek().matches("[0-9]*")) 
							if(stack.size()!=1) 
								stack.push(String.valueOf(Integer.parseInt(stack.pop())+Integer.parseInt(num)));
					}
				}
			}
		}

		String result = null;
		if(!stack.isEmpty()) {
			result = stack.pop();
			if(stack.isEmpty()&&result.matches("[0-9]*"))
				System.out.println(result);
			else
				System.out.println("0");
		}
		else
			System.out.println("0");
	}
}

