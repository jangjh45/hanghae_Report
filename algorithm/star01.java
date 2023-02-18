package algorithm;

import java.util.Scanner;

public class star01 {
    public static void main(String[] args) {
        System.out.println("몇개?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=0; i<num; i++){
            for (int j=num-1; j>i; j--){
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
