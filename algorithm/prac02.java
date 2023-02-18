package algorithm;

public class prac02 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        for (int i=0; i< arr1.length; i++){
            answer += arr2[i]>=29 ? 21-(arr1[i]) : arr2[i]-arr1[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        prac02 method = new prac02();
        int[] arr1 = {9, 9, 9, 9, 7, 9, 8};
        int[] arr2 = {23, 23, 30, 28, 30, 23, 23};
        System.out.println(method.solution(arr1, arr2));
    }
}
