package algorithm;

public class ex29 { // 3진법 뒤집기
    public static long solution(long n){
        long answer = 0;
        String con_str = "";

        while(n>0){
            con_str += n%3+"";
            n = n/3;
        }
        System.out.println("10진법->3진법 : "+Integer.parseInt(con_str));
        System.out.println("Integer.parseInt 기능-3진법 변환 : "+Integer.parseInt(con_str,3));

        long con_num = Long.parseLong(con_str);
        int pow = 1;
        while (con_num>0){
            answer += (con_num%10)*pow;
            con_num = con_num/10;
            pow*=3;
        }


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(45));
    }
}
