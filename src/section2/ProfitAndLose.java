package section2;

import java.util.Scanner;

public class ProfitAndLose {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of dozens of toys purchased");
        int x = sc.nextInt();
        System.out.println("Enter the price per dozen");
        int y = sc.nextInt();
        System.out.println("Enter the selling price of 1 toy ");
        int z = sc.nextInt();
        float a = y;
        float b = z;
        float profit = b - (a / 12);
        float profitPercent = (profit / (a / 12)) * 100;
        System.out.printf("Sam's profit percentage is %.2f percent", profitPercent);

        sc.close();

    }

}
