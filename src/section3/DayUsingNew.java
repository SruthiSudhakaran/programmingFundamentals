package section3;

import java.util.Scanner;

public class DayUsingNew {

    public static void main(String[] args) {

        String days[] = new String[] { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat" };
        System.out.println("Enter the day number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Day of the week is " + days[number - 1]);
        sc.close();

    }

}
