package report3;

public class Report3_1 {
    public static void main(String[] args) {
        //int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
        int x = 15;
        if (x > 10 && x < 20) {
            System.out.println("true1");
        }
        //char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
        char ch = 'a';
        if (ch != ' ' && ch != '\t') {
            System.out.println("true2");
        }
        //char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
        char ch2 = 'x';
        if (ch2 == 'x' || ch2 == 'X') {
            System.out.println("true3");
        }
        //char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
        char ch3 = '1';
        if (ch3 >= 48 && ch3 <= 57) {
            System.out.println("true4");
        }
        //char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
        char ch4 = 'A';
        if (ch4 >= 65 && ch4 <= 90 || ch4 >= 97 && ch4 <= 122) {
            System.out.println("true5");
        }
        //int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을때 true인 조건식
        int year = 4;
        if (year % 100 != 0 && (year % 400 == 0 || year % 4 == 0)) {
            System.out.println("true6");
        }
        //boolean형 변수 powerOn이 false일 때 true인 조건식
        boolean powerOn = false;
        if (powerOn == false) {
            System.out.println("true7");
        }
        //문자열 참조변수 str이 "yes"일 때 true인 조건식
        String str = "yes";
        if (str.equals("yes")) {
            System.out.println("true8");
        }
    }
}
