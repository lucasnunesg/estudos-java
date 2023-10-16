package polymorphism.products;

import polymorphism.products.entities.ImportedProduct;
import polymorphism.products.entities.Product;
import polymorphism.products.entities.UsedProduct;
import polymorphism.products.entities.Utils;

import java.sql.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Product product = new Product();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            switch (productType) {
                case 'u' -> {
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    sc.nextLine();
                    String date = sc.nextLine();
                    LocalDate manufactureDate = LocalDate.parse(date, Utils.fmt);
                    product = new UsedProduct(name, price, manufactureDate);
                }
                case 'i' -> {
                    System.out.print("Customs fee: ");
                    Double customsFee = sc.nextDouble();
                    product = new ImportedProduct(name, price, customsFee);
                }
                case 'c' -> product = new Product(name, price);
            }
            products.add(product);
        }

        sc.close();
        System.out.println("PRICE TAGS:");
        for (Product p: products){
            System.out.println(p.priceTag());
        }
    }
}
