package algorithm;

import java.util.Arrays;

public class ex21 { // 이상한 문자 만들기
    public static String solution(String s){
        String answer = "";

        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));

        int cnt = 0;
        for (String split_s : arr){
            cnt = split_s.contains(" ") ? 0 : cnt+1;
            answer += cnt%2!=0 ? split_s.toUpperCase() : split_s.toLowerCase();
        }

        int cnt1 = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i].equals(" ")) {
                cnt1 = 0;
            } else if(cnt1 % 2 == 0) {
                arr[i] = arr[i].toUpperCase();
                cnt1++;
            } else if(cnt % 2 != 0) {
                arr[i] = arr[i].toLowerCase();
                cnt1++;
            }
            answer += arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
}
