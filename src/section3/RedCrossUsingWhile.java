package section3;

import java.util.Scanner;

public class RedCrossUsingWhile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;
        int n = s.nextInt();
        int[] refugees = new int[n];
        int i = 0;
        while (i < refugees.length) {
            refugees[i] = s.nextInt();
            total = total + refugees[i];
            i++;
        }
        System.out.println(total);

        s.close();

    }

}
