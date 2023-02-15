package algorithm;

public class ex09 { // 핸드폰 번호 가리기
    public static void main(String[] args) {
        String phone_number = "01033334444";
        String answer = "";

        String hide_num = phone_number.substring(0,phone_number.length()-4);
        String show_num = phone_number.substring(phone_number.length()-4);

        for (int i=0; i<hide_num.length(); i++){
            answer += "*";
        }
        answer += show_num;

        System.out.println("hide_num = " + hide_num);
        System.out.println("show_num = " + show_num);
        System.out.println("answer = " + answer);
    }
}
