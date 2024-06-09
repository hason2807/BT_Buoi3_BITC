public class Bai1_CheckYear {
    public void CheckLeapYear(int year) {
        boolean isLeapYear;

        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 100 == 0) {
            isLeapYear = false;
        } else if (year % 4 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        if (isLeapYear) {
            System.out.println(year + " la nam nhuan");
        } else {
            System.out.println(year + " khong phai la nam nhuan");
        }
    }
}