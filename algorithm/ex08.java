package algorithm;

public class ex08 { // 평균 구하기
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        double answer = 0;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        answer = (double) total / arr.length;

        System.out.println("answer = " + answer);
    }
}
