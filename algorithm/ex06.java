package algorithm;

public class ex06 { // 없는 숫자 더하기
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
        int answer = 0;
//        for (int i=0; i<=9; i++){
//            answer += i;
//        }
//        for(int j : numbers){
//            answer -= j;
//        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == numbers[j]) {
                    break;
                }
                if (j == numbers.length - 1) {
                    //배열길이 7이 넘으면 arr에는없는 j값이기 때문에 값을 더함
                    answer += i;
                }
            }
        }
        System.out.println(answer);
    }
}
