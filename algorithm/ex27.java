package algorithm;

public class ex27 { // 콜라츠 추측
    public static int solution(long num) {
        int answer = 0;

//        while (num!=1) {
//            if (num % 2 == 0) num /= 2;
//            else num = num * 3 + 1;
//            answer++;
//            if (answer >= 500) {
//                return -1;
//            }
//        }
//        return answer;

        int count = 0;

        while (count < 500) {
            if (num == 1) {
                break;
            }
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
            count++;
        }
        if (num > 1) return -1;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(16));
    }
}
