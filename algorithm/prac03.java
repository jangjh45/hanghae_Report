package algorithm;

import java.util.Arrays;

public class prac03 {
    public String solution(String s) {

        //공백 삭제
        String[] strnum = s.split(" ");

        //int배열에 strnum값 넣기
        int[] arr = new int[strnum.length];
        for (int i = 0; i < strnum.length; i++) {
            arr[i] = Integer.parseInt(strnum[i]);
        }
        //int 배열 정렬
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //소수인 수의 최대값 찾기
        int max = 0;
        for (int i = 0; i <= strnum.length - 1; i++) {
            if (isPrime(arr[i])) {
                max = arr[i];
            }
        }
        //소수가 아닌 수의 최소값 찾기
        int min = 0;
        for (int j = strnum.length - 1; j >= 0; j--) {
            if (!isPrime(arr[j])) {
                min = arr[j];
            }
        }
        return "" + min + " " + max;
    }

    public static void main(String[] args) {
        prac03 method = new prac03();
        String s = "97 75 88 99 95 92 73";
        System.out.println(method.solution(s));
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}