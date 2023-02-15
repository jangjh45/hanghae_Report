package algorithm;

public class ex13 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        String answer = "";

        //12개월 각날짜 => 31,29,31......
        int[] day = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] date = {"sum","mon","tue","wed","tue","fri","thu"};
        int total = 0;

        for (int i=0; i<a-1; i++){
            total += day[i];
        }
        total = total +b-1;
        answer = date[total%7];
        System.out.println(answer);
    }
}
