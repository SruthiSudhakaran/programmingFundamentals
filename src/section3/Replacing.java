package section3;

import java.util.Scanner;

public class Replacing {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the content of the document");
        String content= sc.nextLine();
        System.out.println("Enter the old name of the company");
        String oldName=sc.nextLine();
        System.out.println("Enter the new name of the company");
        String newName=sc.nextLine();
        System.out.println(content.replace(oldName, newName));
        sc.close();
    }

}
