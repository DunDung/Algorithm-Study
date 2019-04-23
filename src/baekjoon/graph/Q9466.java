package baekjoon.graph;


import java.util.Arrays;
import java.util.Scanner;

//�� ������Ʈ
//�����ϱ� ������..
//X
public class Q9466 {
	static int a[]; //�Է¹޴� �迭
    static int check[]; //�湮 check(���ۿ������� ���°�� �湮�Ǵ� ������)
    static int startVertex[];   //��������
     
    static int dfs(int i, int cnt, int start){
        
        if(check[i]!=0){ //�̹� �湮�ߴ� �����̶��
            if(start!=startVertex[i]) //���� ������ ���� �ʴٸ�
                return 0;   			//0����
            return cnt-check[i]; //���° �湮�� �������� ����..
        }
         
        check[i]=cnt; //���° �湮�Ѱ��� ���� 
        startVertex[i]=start; 
        return dfs(a[i],cnt+1, start); //����Ű�� ����, +1��° �湮, start�״�� 
    }
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
         
        while(t-- > 0)
        {
            int n=sc.nextInt();
            a=new int[n+1];
            check=new int[n+1];
            startVertex=new int[n+1];
             
            for(int i=1;i<=n;i++)
                a[i]=sc.nextInt();
             
            int ans=0;
            for(int i=1;i<=n;i++){
                if(check[i]==0)
                    ans+=dfs(i,1,i);
            }
            System.out.println(Arrays.toString(check));
            System.out.println(Arrays.toString(startVertex));
            System.out.println(n-ans);
         
        }
    }
}


