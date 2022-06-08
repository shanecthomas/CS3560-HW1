import java.util.Scanner;

public class Date {
    public Date (String m, int d, int y) {
        month = m;
        day = d;
        year = y;
        Scanner keyboard = new Scanner(System.in);
        while (!validate()) {
            System.out.println("Invalid date. Please re-enter the date:");
            System.out.print("Month: ");
            month = keyboard.nextLine();
            System.out.print("Date: ");
            day = keyboard.nextInt();
            System.out.print("Year: ");
            year = keyboard.nextInt();
        }
    }

    public String toString() {
        return this.month + "," + this.day + "," + this.year + "\n";
    }

    private boolean validate() {
        boolean leap = false;

        //Year valid?
        if (String.valueOf(year).length() != 4)
            return false;

        //Month valid?
        if (!month.matches("(?i)January|February|March|April|May|June|July|August|September" +
                "|October|November|December"))
            return false;

        //Day valid?
        if (day > 31 || day < 1)
            return false;
        else {
            if (day > 28) {
                //if day = 31 & not in a 31-day month
                if (day == 31 && !month.matches("(?i)January|March|May|July|August|October|December"))
                    return false;
                //if day = 30 & in February
                else if (day == 30 && month.equalsIgnoreCase("February"))
                    return false;
                else {
                    //Leap Year Formula
                    if (year % 4 == 0) {
                        if (year % 100 == 0) {
                            if (year % 400 == 0)
                                leap = true;
                        } else
                            leap = true;
                    }
                    //if day = 29 & not leap year
                    if (!leap)
                        return false;
                }
            }
        }
        return true;
    }

    private String month;
    private int day;
    private int year;

}
