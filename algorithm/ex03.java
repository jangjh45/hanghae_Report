package algorithm;

public class ex03 { // 가운데 글자 가져오기
    public static void main(String[] args) {
        String s = "abcde";
        String answer = "";
        if(s.length() % 2 == 0){
            answer += s.charAt(s.length()/2-1);
            answer += s.charAt(s.length()/2);
        }
        else {
            answer += s.charAt(s.length()/2);
        }
        System.out.println("answer = " + answer);
    }
}