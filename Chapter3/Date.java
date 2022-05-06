package Chapter3;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    public String displayDate(){
        return "" + this.month + '/' + this.day + '/' + this.year;
    }
}
