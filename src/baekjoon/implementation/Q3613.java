package baekjoon.implementation;

import java.util.Scanner;

//Java vs C++
//�ݷʸ� �ٻ������� ����
//ù���ڰ� �ҹ��ڰ� �ƴѰ��
//_�� �������� ���ð��
//�������� _�ΰ��
//���ĺ�, _�� �ƴ� �ٸ� ���ڰ� �ð��
//_���� �빮�ڰ� �ð��
//��� �ҹ��ڴ� ����
public class Q3613 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.next());
		if(!(sb.charAt(0)>='a' && sb.charAt(0)<='z')) {
			System.out.println("Error!");
		} else if(sb.indexOf("__")>=0){
			System.out.println("Error!");
		} else if(sb.charAt(sb.length()-1)=='_'){
			System.out.println("Error!");
		}else {
			boolean java = false, c = false;
			for(int i=0; i<sb.length(); i++) {
				if(sb.charAt(i)=='_') {
					c = true;
					if(sb.charAt(i+1) >='A' && sb.charAt(i+1)<='Z') {
						java= true;
						break;
					}
					sb.delete(i, i+1);
					sb.replace(i, i+1, sb.substring(i, i+1).toUpperCase());
				}else if(sb.charAt(i)>='A' && sb.charAt(i)<='Z') {
					java = true;
					if(i+1 < sb.length() && sb.charAt(i+1) =='_') {
						c= true;
						break;
					}
					sb.replace(i, i+1, sb.substring(i, i+1).toLowerCase());
					sb.insert(i, '_');
				}else if(Character.isLetter(sb.charAt(i))) {
					continue;
				} else {
					java =true;
					c= true;
					break;
				}
			}
			if((java && c)) {
				System.out.println("Error!");
			} else {
				System.out.println(sb.toString());
			}
		}
	}

}
