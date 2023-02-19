package javajungsuk.date;

import java.util.Calendar;

public class ex01 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        // get은 객체의 필드이 값을 가지고 오는것
        System.out.println(today.get(Calendar.YEAR));
        System.out.println(today.get(Calendar.MONTH));
        System.out.println(today.get(Calendar.WEEK_OF_YEAR));
        System.out.println(today.get(Calendar.WEEK_OF_MONTH));
        System.out.println(today.getActualMaximum(Calendar.DATE)); // 이 달의 마지막 일

        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();
        date1.set(2020, 8, 15);

        System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);
        System.out.println("오늘은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]);

        long difference = (date2.getTimeInMillis()- date1.getTimeInMillis())/1000;
        System.out.println(difference);
        System.out.println(difference/(24*60*60));
    }
    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR)+"년 "+ (date.get(Calendar.MONTH)+1)
                +"월 " + date.get(Calendar.DATE) + "일 ";
    }
}
