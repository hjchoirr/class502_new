package exam01;

public class Schedule {
    private int year;
    private int month;
    private int day;

    public Schedule(){
        this(2024, 4, 16);
    }
    public Schedule(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Schedule(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(this.month == 2 && day > 28) {
            day = 28;
        }
        this.day = day;
    }

    void showDate() {
        System.out.printf("%d년 %d월 %d일%n", year, month, day);  //this 생략 -> this.year
    }
    public void printThis() {
        System.out.println(this);
    }
    public Schedule returnThis() {
        return(this);
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
