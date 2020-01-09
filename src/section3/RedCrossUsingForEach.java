package section3;

import java.util.Scanner;

public class RedCrossUsingForEach {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;
        int n = s.nextInt();
        int[] refugees = new int[n];
        for (int i : refugees) {
            refugees[i] = s.nextInt();
            total = total + refugees[i];
        }
        System.out.println(total);

        s.close();

    }

}
