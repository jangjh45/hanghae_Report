package algorithm;

public class ex19 { // 수박수박수박
    public static String solution(int n) {
        String answer = "";

        int num = 0;
        String[] subak = {"수", "박"};
        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            if (num == 0) {
                arr[i] = subak[num];
                num = 1;
            } else if (num == 1) {
                arr[i] = subak[num];
                num = 0;
            }
        }
        for (String s : arr){
            answer += s;
        }

        return answer;
    }
//    for(int i=0;i<n;i++) {
//        result +=(i%2==0)? "수":"박";
//    }

//    StringBuffer sf = new StringBuffer();
//        for(int i=1; i<=n; ++i){ sf.append(i%2==1?"수":"박"); }
//        return sf.toString();

    public static void main(String[] args) {
        System.out.println(solution(3));
    }
}
