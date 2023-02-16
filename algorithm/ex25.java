package algorithm;

public class ex25 { // 정수 제곱근 판별
    public static long solution(long n){
        long answer = 0;

        long num = (long) Math.sqrt(n);
        System.out.println(num);
        answer += num*num==n ? Math.pow(num+1,2) : -1;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(121));
    }
}
