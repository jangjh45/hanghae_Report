package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ex35 {
    public static String[] solution(String[] strings, int n) {

        // n번째 글자를 골라내서 리스트에 (a+car) 이렇게 추가해서 정렬 준비준비를 한다.
        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i<strings.length; i++){
            list.add(strings[i].charAt(n)+strings[i]);
        }
        // [usun, ebed, acar] 이상태에서 정렬하면
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        String[] answer = new String[strings.length];
        for (int i=0; i< strings.length; i++){
            answer[i] = list.get(i).substring(n,list.get(i).length());
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {"sun","bed","car"};
        System.out.println(Arrays.toString(solution(arr,1)));
    }
}
