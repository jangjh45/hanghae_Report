package report4;

//5-1. 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하세요.
public class Report4_1 {
    public static void main(String[] args) {
        int[] arr[];
        int[] arr2 = {1, 2, 3,}; // 쉼표 상관없음
        int[] arr3 = new int[5];
//        int[] arr4= new int[5]{1,2,3,4,5};
        // 배열의 생성과 초기화를 동시에 할려면 []숫자 넣으면 안된다.
        // 대괄호 숫자 개수만큼 크기가지정됨.
//        int arr[5]; // 배열을 선언하는 공간이기 때문에 크기를 지정할 수 없다.
        int[] arr6[] = new int[3][];
        // 오류는 아니지만
        // int[][] arr6 = new int[3][]
        // int arr6[][] = new int[3][] 올바른거 같다.
    }
}
