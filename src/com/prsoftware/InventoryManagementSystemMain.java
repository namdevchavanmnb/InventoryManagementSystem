package com.prsoftware;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class InventoryManagementSystemMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        boolean exit = false;
        while (!exit) {
            System.out.println(" Press\n 1 ->  Product Management\n" +
                    "2 -> Stock Tracking\n " +
                    "3 -> Sales Recording\n" +
                    "4 -> Report Generation\n" +
                    "5 -> exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    exit = true;
            }
        }
    }
    private static void addProduct() {
        Product add = new Product();
        System.out.println("Enter Product Name:");
        add.setProductName(scanner.next());
        System.out.println("Enter Product Price :");
        add.setPrice(scanner.nextInt());
        System.out.println("Enter Product Quantity");
        add.setQuantity(scanner.nextInt());

    }
}