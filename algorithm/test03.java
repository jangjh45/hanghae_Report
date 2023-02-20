package algorithm;

import java.util.Arrays;

/**
 * 지뢰는 '*' 처리
 * x랑 y는 한칸씩 이동하면서 주위를 돌아서 검사하는 거 같은데
 * 지뢰 주위를 검사하다가 '.'이 아니라 숫자가 보이면 바로 더하기 해버리기
 * 검사해야할 8군데에서 범위 밖은 어떻함?? 이거를 모르곘네;;;
 * [-1][-1]????? 0~4
 */
public class test03 {
    public char[][] solution(int N, char[][] ary) {
        int[] x = {1, -1, 0, 0, 1, 1, -1, -1};
        int[] y = {0, 0, 1, -1, 1, -1, 1, -1};

        char[][] answer = new char[N][N];
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                if (ary[i][j] >= 48 && ary[i][j] <= 57) { // 지뢰는 '*'출력하라는 조건
//                    answer[i][j] = '*';
//                    continue; // 지뢰는 * 처리 했으니까 다음 j 반복문 으로 가서 다음꺼 확인
//                }
//                for (int k = 0; k < x.length; i++) {
//                    // [0][0] 구간 검사할때 -1 -1 , -1 0 , 0 -1 안되니까
//                    // [4][4] 구간은 5 5 , 5 4 , 4 5 범위 밖임
//                    if (i + x[k] < 0 || j + y[k] < 0 || i + x[k] > N-1 || j + y[k] > N-1) continue;
//
//                    if (ary[i + x[k]][j + y[k]] >= '1' && ary[i + x[k]][j + y[k]] <= '9') {
//                        answer[i][j] += ary[i + x[k]][j + y[k]] - '0';
//                    }
//
//                }
//            }
//        }
//        for (int o=0; o<answer.length; o++){
//            for (int p=0; p<answer.length; p++){
//                if (answer[o][p]>9) answer[o][p] = 'M';
//            }
//        }
        for (int i = 0; i < answer.length; i++) {
            Loop:
            for (int j = 0; j < answer[i].length; j++) {
                if (ary[i][j] >= '1' && ary[i][j] <= '9') {    // char 타입이기 때문에 10 이상이 값일리가 없음
                    answer[i][j] = '*';
                    continue;
                }

                if (answer[i][j] == Character.MIN_VALUE) answer[i][j] = '0';

                for (int k = 0; k < x.length; k++) {
                    if (i + x[k] < 0 || j + y[k] < 0 || i + x[k] == N || j + y[k] == N) continue;

                    if (ary[i + x[k]][j + y[k]] >= '1' && ary[i + x[k]][j + y[k]] <= '9') {
                        answer[i][j] += ary[i + x[k]][j + y[k]] - '0';
                    }

                    if (answer[i][j] > '9') {
                        answer[i][j] = 'M';
                        continue Loop;
                    }
                }

            }
        }
        return answer;

    }

    public static void main(String[] args) {
        test03 method = new test03();
        int N = 5;
        char[][] chars = {{'1', '.', '.', '.', '.'},
                {'.', '.', '3', '.', '.'},
                {'.', '.', '.', '.', '.'},
                {'.', '4', '.', '.', '.'},
                {'.', '.', '.', '9', '.'}};
        System.out.println(Arrays.deepToString(method.solution(N, chars)));
    }
}
