package section2;

import java.util.Scanner;

public class LabAllocation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int firstNo = sc.nextInt();
        System.out.println("Enter y");
        int secondNo = sc.nextInt();
        System.out.println("Enter z");
        int thirdNo = sc.nextInt();
        if (firstNo < secondNo && firstNo < thirdNo) {
            System.out.println("L1 is minimal seating capacity");
        } else if (secondNo < firstNo && secondNo < thirdNo) {
            System.out.println("L2 is minimal seating capacity");
        } else {
            System.out.println("L3 is minimal seating capacity");
        }
        sc.close();

    }

}
