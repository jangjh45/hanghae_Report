package algorithm;

import java.util.HashMap;
import java.util.Map;

public class ex20 { // 완주하지 못한 선수
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        System.out.println("participant = " + Arrays.toString(participant));
//        System.out.println("completion = " + Arrays.toString(completion));
//        int i;
//        for (i = 0; i < completion.length; i++) {
//            if (!participant[i].equals(completion[i])) {
//                break;
//            }
//        }
//        answer += participant[i];

        HashMap<String, Integer> map = new HashMap<>();
        // map.getOrDefault(ps,0)+1
        // ps키의 값을 가지고오는데 값이 없으면 0을 리턴 (0+1해서 1을 넣어줌)
        for (String ps : participant){
            map.put(ps,map.getOrDefault(ps,0)+1);
        }
        // map.get(cs)-1
        // cs키의 값을 가지고와서 -1한 다음 0을 넣음
        for (String cs : completion){
            map.put(cs,map.get(cs)-1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue()!=0) {
                answer += entry.getKey();
                break;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        System.out.println(solution(participant, completion));
    }
}
