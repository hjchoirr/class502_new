package homework;

import java.time.LocalDate;
import java.util.Scanner;

public class CalTest2 {
    public static void main(String[] args)  {

        while(true) {
            System.out.print("년 월 입력 : ");
            Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();
            if(str.equals("exit")) break;

            String[] data = str.split("\\s+");
            try {
                int year = Integer.parseInt(data[0]);
                int month = Integer.parseInt(data[1]);
                System.out.printf("   ---------- %d년 %d월 ----------%n", year, month);
                System.out.println("  Sun  Mon  Tus  Wen  Thu  Fri  Sat");

                getCalendar(year, month);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("다시 입력하세요.");
            }
        }
    }
    public static void getCalendar(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        int sDayNum = date.getDayOfWeek().getValue();

        int eDateDay = date.plusMonths(1).minusDays(1).getDayOfMonth();

        for(int i = 0; i < sDayNum; i++) {
            if(sDayNum < 7) System.out.print("     ");
        }
        for(int i = 1; i <= eDateDay ; i ++) {

            LocalDate aDay = LocalDate.of(year, month, i);
            int dayNum = aDay.getDayOfWeek().getValue();

            System.out.printf("   %02d", i);
            if(dayNum == 6 && i != eDateDay) System.out.println();
        }
        System.out.println();
    }
}
