package com.sebaare.shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productCode;
    
    private String name;
    private String brand;
    private Double cost;
    private Double stock;

    public Product() {
    }

    public Product(Long productCode, String name, String brand, Double cost, Double stock) {
        this.productCode = productCode;
        this.name = name;
        this.brand = brand;
        this.cost = cost;
        this.stock = stock;
    }
    
    
    
}
