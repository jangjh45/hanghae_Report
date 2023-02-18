package algorithm;

import java.util.Arrays;
import java.util.Collections;

public class ex36 {
    public static String solution(String s) {
        String answer = "";

        String[] strarr = s.split("");
        Arrays.sort(strarr, Collections.reverseOrder());
        System.out.println(Arrays.toString(strarr));
        for (int i=0; i< strarr.length; i++){
            answer += strarr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}
