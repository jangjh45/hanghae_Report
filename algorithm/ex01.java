package algorithm;

public class ex01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int i = 0;
        int j = 0;

        while(b>i) {
            while(a>j) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
            j=0;
        }
    }
}
