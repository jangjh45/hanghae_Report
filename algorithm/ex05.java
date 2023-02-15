package algorithm;

public class ex05 {
    public static void main(String[] args) {
        String str = "-1234";
        boolean plus = true;
//
//        // Char charAt(int index) = String 문자열에서 index 번째 문자 값 1개를 가져온다.
//
//        char[] c = new char[str.length()];
//        for (int i=0; i<str.length(); i++){
//            c[i] = str.charAt(i);
//        }
        int value = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '-') {
                plus = false;

            } else {
                int num = ch - 48;
                value = num+value*10;
            }

        }
        System.out.println((plus==true)? value : -1*value);
    }
}
