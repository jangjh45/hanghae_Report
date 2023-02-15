package algorithm;

import java.util.Arrays;

public class ex11 { // x만큰 간격이 있는 n개의 숫자
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long[] answer = new long[n];
        long sum = 0;
        for (int i=0; i<n; i++){
            sum+=x;
            answer[i] = sum;
        }
        System.out.println("answer = " + Arrays.toString(answer));
    }
}
