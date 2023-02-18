package algorithm;

public class ex30 { // 최소직사각형
    public static int solution(int[][] sizes){
        int answer = 0;

        // 명함을 회전시켜서 가로의 젤 긴부분 세로의 젤 기부분을
        // 회전시켜서 배치한다 생가갛고 비교하면 쉽게 풀림

        int max_width = Integer.MIN_VALUE;
        int min_height = Integer.MIN_VALUE;
        for (int i=0; i<sizes.length; i++){
            int best_width = Math.max(sizes[i][0], sizes[i][1]);
            int best_height = Math.min(sizes[i][0], sizes[i][1]);
            max_width = Math.max(best_width, max_width);
            min_height = Math.max(best_height, min_height);
        }
        answer = max_width*min_height;

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(arr));
    }
}
