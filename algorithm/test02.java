package algorithm;

import java.util.Arrays;

public class test02 {
    public int solution(String s) {
        int answer = 0;
        int count = 1;
        char[] c = s.toCharArray(); // 문자열을 문자배열에 한칸씩 넣음
        System.out.println(Arrays.toString(c));

        for (int i = 0; i < c.length; i++) { // 글자 개수만큼 반복
            // c배열에 하나씩 꺼내서 O이면 현재 count개수를 정답에 더하기
            // 그리고 카운터 +1
            // O가 아닌 다른것이오면 카운터 1로 초기화
            if (c[i] == 'O') { 
                answer += count;
                count++;
            } else {
                count = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        test02 method = new test02();
        String s = "OXOOOXXXOXOOXOOOOOXO";
        String s1 = "OOXXOXXOOO";
        String s2 = "OXOXOXOXOXOXOX";
        String s3 = "OOOOOOOOOO";

        System.out.println(method.solution(s));
        System.out.println(method.solution(s1));
        System.out.println(method.solution(s2));
        System.out.println(method.solution(s3));
    }
}
