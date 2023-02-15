package algorithm;

public class ex07 { // 음양 더하기
    public static void main(String[] args) {
//        int[] absolutes = {4, 7, 12};
//        boolean[] signs = {true, false, true};
        int[] absolutes = {1,2,3};
        boolean[] signs = {false,false,true};

        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == false) {
                absolutes[i] *= -1;
            }
        }
        for (int j = 0; j < absolutes.length; j++) {
            answer += absolutes[j];
        }
        System.out.println(answer);
    }
}
