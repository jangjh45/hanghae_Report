package algorithm;

import java.util.Arrays;

public class ex24 {
    public static long solution(long n) {
        String answer = "";

        String s = ""+n;
        int[] num_arr = new int[s.length()];
        for (int i=0; i<num_arr.length; i++){
            num_arr[i] = Integer.parseInt(s.substring(i,i+1));
        }
        System.out.println(Arrays.toString(num_arr));

        for (int i=0; i<num_arr.length-1; i++){
            for (int j=i+1; j<num_arr.length; j++){
                if (num_arr[i]<num_arr[j]){
                    int tmp = num_arr[j];
                    num_arr[j] = num_arr[i];
                    num_arr[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(num_arr));
        for (int k=0; k<num_arr.length; k++){
            answer += num_arr[k];
        }

        return Long.parseLong(answer);
    }

    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
