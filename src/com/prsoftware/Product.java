package com.prsoftware;



import java.time.LocalDate;

public class Product {
    private String productName;
    private int price;
    private int quantity;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String ProductName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Product{" +
                "ProductName='" + productName + '\'' +
                ", Price='" + price + '\'' +
                ", Quantity='" + quantity + '\'' +
                '}';
    }
}

