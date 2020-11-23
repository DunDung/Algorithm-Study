package programmers.lv2;

import java.util.Arrays;

public class ����Ʈ {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int lightest = 0;
        for (int heaviest = people.length - 1; heaviest >= lightest; heaviest--) {
            answer++;
            if (people[lightest] + people[heaviest] > limit) {
                continue;
            }
            lightest++;
        }
        return answer;
    }
}
