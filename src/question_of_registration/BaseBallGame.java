package question_of_registration;

import java.util.Scanner;

//20190328
//�߱�����
public class BaseBallGame {
	static	Scanner scan = new Scanner(System.in);
	
	static int [] random() {
		int [] random = new int[3];
		
		for(int i=0; i<3; i++) 
			random[i] = (int)(Math.random()*9);
		
		if(random[0] == random[1] || random[0] == random[2] || random[1] == random[2])
			return random();
		
		return random;
	}
	static void baseBall() {
		int [] random = random();
		
		while(true) {
			int strike = 0, ball = 0;
			System.out.print("���ڸ� �Է�: ");
			String userNum = scan.next();
			
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j<3; j++) {
					if(userNum.substring(i, i+1).equals(String.valueOf(random[j]))) {
						if(i == j)
							strike++;
						else
							ball++;
					}
				}
			}
			
			if(strike == 3) {
				System.out.println("����");
				break;
			}
			else if(strike>0 && ball>0)
				System.out.println(strike+"��Ʈ����ũ "+ball+"��");
			else if(strike>0||ball>0) {
				if(strike>0)
					System.out.println(strike+"��Ʈ����ũ");
				else if(ball>0)
					System.out.println(ball+"��");
			}
			else
				System.out.println("�ƿ�");
		}
		
		System.out.println("������ ����Ͻðڽ��ϱ�? (1=���,0=����)");
		int select = scan.nextInt();
		if(select == 1)
			baseBall();
	}
	
	public static void main(String[] args) {
		baseBall();
	}
}
