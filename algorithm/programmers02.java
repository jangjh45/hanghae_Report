package algorithm;

public class programmers02 {
    public static int solution(int n) {
        int answer = 0;

        int min = Integer.MAX_VALUE;
        for (int i=1; i<=n; i++){
            if (n%i==1){
                min = Math.min(i, min);
            }
        }
        answer = min;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
