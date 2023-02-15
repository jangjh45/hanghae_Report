package algorithm;

public class ex04 { // 두 정수 사이의 합
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        long answer = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else if (a > b) {
            for (int j = b; j<=a; j++) {
                answer += j;
            }
        } else {
            answer += a;
        }
        System.out.println(answer);
    }
}
