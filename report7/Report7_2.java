package report7;

public class Report7_2 {
    public static boolean isNumber(String str) {
        boolean answer = true;

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if (str.charAt(i) < 48 || str.charAt(i) > 57) {
                return false;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
    }
}
