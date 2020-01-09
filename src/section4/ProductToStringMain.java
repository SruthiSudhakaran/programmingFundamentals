package section4;

import java.util.Scanner;

public class ProductToStringMain {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product id");
        Long id=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the product name");
        String productName=sc.nextLine();
        System.out.println("Enter the supplier name");
        String supplierName=sc.nextLine();
        ProductToString p=new ProductToString(id, productName, supplierName);
        

    }

}
