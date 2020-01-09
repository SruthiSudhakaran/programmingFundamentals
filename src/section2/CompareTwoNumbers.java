package section2;

import java.util.Scanner;

public class CompareTwoNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNo = sc.nextInt();
        System.out.println("Enter second number");
        int secondNo = sc.nextInt();
        if (firstNo < secondNo) {
            System.out.println(firstNo + " is less than " + secondNo);
        } else if (firstNo > secondNo) {
            System.out.println(firstNo + " is greater than " + secondNo);
        } else {
            System.out.println(firstNo + " is equal to " + secondNo);
        }
        sc.close();

    }

}
