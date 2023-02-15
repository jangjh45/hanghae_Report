package algorithm;

public class ex17 { // 문자열 다루기 기본
    public static void main(String[] args) {
        String s = "1234";
        boolean answer = true;

        System.out.println(s.length());
        if (s.length()!=4 && s.length()!=6 ){
            answer = false;
        }

        char[] c = s.toCharArray();
        for (char x : c){
            if (x>=65 && x<=90 || x>=97 && x<=122){
                answer = false;
                break;
            }
        }
        System.out.println(answer);
    }
}
