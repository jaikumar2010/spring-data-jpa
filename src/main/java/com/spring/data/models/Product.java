package com.spring.data.models;

import jakarta.persistence.*;

@Entity
@Table
public class Product {
    @Id
    @SequenceGenerator(name = "product_sequence",
    sequenceName = "product_sequence",
    initialValue = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private long id;
    private String productName;
    private String description;
    private long price;

    public Product(long id, String productName, String description, long price) {
        this.id = id;
        this.productName = productName;
        this.description = description;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
