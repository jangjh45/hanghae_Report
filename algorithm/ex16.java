package algorithm;

import java.util.Arrays;

public class ex16 { // 문자열 내 p와 y의 개수
    public static void main(String[] args) {
        String s = "pPoooaY";
        boolean answer = true;

        char target_p = 'p';
        char target_y = 'y';

        int count_p = 0;
        int count_y = 0;

        s = s.toLowerCase();
        char[] c = s.toCharArray();
        System.out.println(Arrays.toString(c));
        for (char x : c){
            if (target_p==x) count_p++;
            else if (target_y==x) count_y++;
        }
        answer = count_p==count_y ? true : false;
        System.out.println(answer);
    }
}
