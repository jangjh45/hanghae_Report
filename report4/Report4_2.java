package report4;

//5-2. 다음과 같은 배열이 있을 때, arr[3].length의 값은? 2
public class Report4_2 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 6, 7, 8, 9},
                {10, 11, 12},
                {20, 21, 22, 23},
                {30, 31}
        };
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][0]);
        System.out.println(arr[3].length);
    }
}
