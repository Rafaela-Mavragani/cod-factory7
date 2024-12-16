package gr.aueb.cf.ch2;

public class DatetApp {
    public static void main(String[] args) {
        int day = 12;
        int month = 7;
        int year = 1999;

        System.out.println("Η ημερομινια ειναι:" + day + "/" + month + "/" + year);
        System.out.printf("Η ημερομινια ειναι: %02d / %02d / %d",  day ,month ,year );
    }
}
