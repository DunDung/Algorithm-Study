package toss2020.server1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q3 {
    public static void main(String[] args) throws Exception {
        // [!!����!!] Function.compute �Լ��� �̹� �����Ǿ�������, ����ó���Ǿ� �ֽ��ϴ�. ȣ���ؼ� �׽�Ʈ ���ּ���.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        StringBuilder builder = new StringBuilder();
        int[] a = new int[1000000];
        for (int i = 0; i < inputs.length; i++) {
            int v = Integer.parseInt(inputs[i]);
            if (a[v] == 0) {
                //   a[v] = Function.compute(v);
            }
            builder.append(a[v]);
            builder.append(" ");
        }
        System.out.println(builder.toString());
    }
}
