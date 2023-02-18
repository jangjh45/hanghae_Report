package algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class ex32 {
    public static int[] solution(int[] numbers) {

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                hashSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[hashSet.size()];
        Iterator iterator = hashSet.iterator();
        for (int j=0; j< hashSet.size(); j++){
//            iterator.hasNext();
            answer[j] = (int)iterator.next();
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
// hashset은 순서자체가 보장되지 않습니다. 따라서 순서자체가 없다고 봐도됩니다.
// 그러니 정렬같은건 더더욱 불가능하구용 for문을 돌릴때는 순서가 없기때문에
// 랜덤으로 값이 뽑혀져 나옵니다. 아마 포문을 돌리셔서 print로 출력해보시면 할때마다
// 다른 순서로 출력이 될겁니다.