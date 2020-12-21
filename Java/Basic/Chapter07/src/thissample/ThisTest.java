package thissample;

class BirthDay{
    int year;

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}

public class ThisTest {
    public static void main(String[] args) {
        BirthDay bDay = new BirthDay();
        bDay.setYear(2020);
        System.out.println(bDay.getYear());
        System.out.println(bDay);

    }

}
