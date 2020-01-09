package section3;

import java.util.Scanner;

public class Secure {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url");
        String url = sc.nextLine();
        System.out.println("Enter the starting url");
        String starting = sc.nextLine();
        if (url.startsWith(starting)) {
            System.out.println("\"" + url + "\" starts with \""+starting+"\"");
        } else {
            System.out.println("\"" + url + "\" doesnot starts with \""+starting+"\"");
        }
        sc.close();
    }

}
