package com.sebaare.shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Sale {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long saleId;
    
    private LocalDate saleDate;
    private Double total;
    
    @ManyToMany
    @JoinTable(
        name = "sale_product",
        joinColumns = @JoinColumn(name = "sale_id"),
        inverseJoinColumns = @JoinColumn(name = "product_code")
    )
    private List<Product> products;
    
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public Sale() {
    }

    public Sale(Long saleId, LocalDate saleDate, Double total, List<Product> products, Client client) {
        this.saleId = saleId;
        this.saleDate = saleDate;
        this.total = total;
        this.products = products;
        this.client = client;
    }
   
    
    
}
