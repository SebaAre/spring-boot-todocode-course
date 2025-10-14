package com.sebaare.shop.service;

import com.sebaare.shop.model.Product;
import java.util.List;


public interface ProductService {
    
    //CREATE
    public Product createProduct(Product product);
    
    
    //READ
    public List<Product> getProducts();
    public Product getProduct (Long productCode);
    
    
    //UPDATE
    public Product editProduct (Product product);
    
    
    //DELETE
    public void deleteProduct (Long productCode);
    
    
    //CUSTOM - Get products with low stock (< 5)
    public List<Product> getLowStockProducts();
    

}
