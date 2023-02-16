package algorithm;

public class ex28 { // 하샤드 수
    public static boolean solution(int x){
        boolean answer = true;
        int num = x;
        int sum_num = 0;

        while(num>0){
            sum_num += num%10;
            num /= 10;
        }
        answer = x%sum_num==0 ? true : false;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(13));
    }
}
