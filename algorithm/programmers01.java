package algorithm;

public class programmers01 {
    public static int solution(int n) {
        int answer = 0;

        for (int i=1; i<=n; i++){
            if (n%i==0) answer += n/i;
            else continue;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
    }
}
