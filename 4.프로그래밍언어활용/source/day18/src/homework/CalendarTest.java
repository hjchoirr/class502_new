package homework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.print("년월 입력:");
            String input = sc.nextLine(); // 2024 5

            if(input.equals("exit")) {
                System.out.println("종료합니다.");
                break;
            }
            try {
                //정규표현식 split 쪼개기
                String[] data = input.split("\\s+");
                int year = Integer.parseInt(data[0]);
                int month = Integer.parseInt(data[1]);

                System.out.printf("   ---------- %d년 %d월 ----------%n", year, month);
                System.out.println("  Sun  Mon  Tus  Wen  Thu  Fri  Sat");

                LocalDate sdate = LocalDate.of(year, month, 1);
                int sDayNum = sdate.getDayOfWeek().getValue();
                int eDateNum = sdate.plus(1, ChronoUnit.MONTHS).minus(1, ChronoUnit.DAYS).getDayOfMonth();
                for(int i = 0; i < sDayNum; i ++) {
                    System.out.print("     ");
                }
                for(int i = 1; i <= eDateNum; i ++) {
                    if(LocalDate.of(year, month, i).getDayOfWeek().getValue() == 7) {
                        System.out.println();
                    }
                    if(i < 10) System.out.printf("    %d", i);
                    else System.out.printf("   %d", i);
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("입력 형식 잘못되었습니다. 입력예) 2024 5");
            }
        }
    }

    public static Object getCalendar(int year, int month) {
        /**
         * 1.매월의 1일이 어떤 요일인지
         * 2. 매월의 종료일이 몇일인지
         */
        return null;
    }
}
