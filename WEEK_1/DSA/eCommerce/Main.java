package eCommerce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Mobile", "Electronics"),
            new Product(104, "Bag", "Accessories")
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String searchTerm = sc.nextLine();

        Product result1 = SearchUtils.linearSearch(products, searchTerm);
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        Product result2 = SearchUtils.binarySearch(products, searchTerm);
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));

        sc.close();
    }
}
