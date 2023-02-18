package algorithm;

import java.util.Arrays;
import java.util.Stack;

public class ex31 {
    public static int[] solution(int[] arr) {

        Stack<Integer> st = new Stack();
        for (int i = 0; i < arr.length; i++) {
            if (st.empty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            }
        }
        int[] answer = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
