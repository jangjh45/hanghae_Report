package report3;

//4-5. 다음의 for문을 while문으로 변경하세요.
//    public static void main(String[] args) {
//        for (int i = 0; i <= 10; i++) {
//            for (int j = 0; j <= i; j++)
//                System.out.print("*");
//            System.out.println();
//        }
//    }
public class Report3_5 {
    public static void main(String[] args) {
        int i = 0, j;
        while (i <= 10) {
            j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
