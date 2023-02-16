package algorithm;

import java.util.Arrays;

public class ex23 { // 자연수 뒤집기
    public static int[] solution(long n){
        int[] answer = new int[(int)Math.log10(n)+1];

        for (int i=0; i<answer.length; i++){
            answer[i] = (int) (n%10);
            n = n/10;
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12345));
    }
}
