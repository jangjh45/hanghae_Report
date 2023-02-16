package algorithm;

public class ex22 { // 자릿수 더하기
    public static int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n = n / 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(123));
    }
}
