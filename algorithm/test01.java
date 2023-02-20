package algorithm;

public class test01 {
    public int solution(int num) {
        int answer = 0;
        int[] money = {500, 100, 50, 10};
        int pay = 1000 - num; // 거스름돈
        System.out.println(pay);

        for (int i = 0; i < money.length; i++) { // 동전 종류마다 반복
            if (pay >= money[i]) { // 선택된 동전 종류가 거스름돈보다 커야함
                answer += pay / money[i]; // 정답에 동전종류 개수 더하기
                pay = pay % money[i]; // 나머지 pay에 저장
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        test01 method = new test01();
        int num1 = 160;
        int num2 = 900;
        int num3 = 550;
        int num4 = 320;

        System.out.println(method.solution(num1));
        System.out.println(method.solution(num2));
        System.out.println(method.solution(num3));
        System.out.println(method.solution(num4));
    }
}
