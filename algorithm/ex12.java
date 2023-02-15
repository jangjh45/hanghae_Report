package algorithm;

public class ex12 { // 부족한 금액 계산하기
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        long answer = 0;

        long sum = 0;
        for (int i=1; i<=count; i++){
            sum += price*i;
            System.out.println(sum);
        }
        System.out.println(sum>money ? answer += sum-money : "0");

//        if (sum>money){
//            answer += sum-money;
//            System.out.println(answer);
//        }
//        else if(sum<money){
//            System.out.println("0");
//        }

    }
}
