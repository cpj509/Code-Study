package object.equals.mydate;

class MyDate{
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof MyDate){
            MyDate myDate = (MyDate) obj;
            if(this.day == myDate.day)
                if(this.month == myDate.month)
                    return this.year == myDate.year;
        }
        return false;
    }
}

public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(9,18,2004);
        MyDate date2 = new MyDate(9,18,2004);
        System.out.println(date1.equals(date2));

    }
}
