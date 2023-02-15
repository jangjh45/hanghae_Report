package algorithm;

import java.util.Arrays;

public class ex14 { // 나누어 떨어지는 숫자 배열
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        int count = 0;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }
        if (count == 0) {
            int[] answer = {-1};
            System.out.println(answer);
        }

        int[] answer = new int[count];
        int answer_count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[answer_count] = arr[i];
                answer_count++;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
