package algorithm;

import java.util.Arrays;

public class ex26 { // 제일 작은 수 제거하기
    public static int[] solution(int[] arr){
        // 배열 길이가 1인 경우 -1로 반환하고 끝
        if (arr.length==1) {
            int[] answer_one = {-1};
            return answer_one;
        }

        // 가장작은 수 하나 뺴야하니까 총 배열 길이에서 -1 해서 초기화
        int[] answer = new int[arr.length-1];
        // 임이의 값을 줌 int범위의 최대값
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            // 값 두개중 젤 작은거 min 저장
            min = Math.min(min, arr[i]);
        }
        int answer_num = 0;
        for (int j=0; j< arr.length; j++){
            if (arr[j]==min){ // 가장작은수가 있으면 배열에 넣지 않고 통과
                continue;
            }
            else{ // j를 못씀 새로운 index를 부여해서 배열 index0부터 순차적으로 저장
                answer[answer_num++] = arr[j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
