package algorithm;

public class prac01 {
    public String solution(int month, int day, int targetday) {
        String answer = "";

        int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalday = targetday + day;

        month--;
        while (true) {
            if (totalday > monthDay[month]) {
                totalday -= monthDay[month];
                if (month == 11) {
                    month = 0;
                } else {
                    month++;
                }
            } else {
                break;
            }
        }
        System.out.println(targetday + "일 후 날짜는 " + (month + 1) + "월 " + totalday+"일 입니다.");

        return answer;
    }

    public static void main(String[] args) {
        prac01 method = new prac01();
        System.out.println(method.solution(1, 18, 98));
    }
}
