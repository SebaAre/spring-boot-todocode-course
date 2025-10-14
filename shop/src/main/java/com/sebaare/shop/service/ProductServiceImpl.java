package com.sebaare.shop.service;

import com.sebaare.shop.model.Product;
import com.sebaare.shop.repository.ProductRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    
    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long productCode) {
        return productRepository.findById(productCode).orElse(null);
    }

    @Override
    public Product editProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productCode) {
        productRepository.deleteById(productCode);
    }

    @Override
    public List<Product> getLowStockProducts() {
        
        //Get all products
        List<Product> allProducts = this.getProducts();
        
        //This list is where we are gonna store the products with low stock
        List<Product> lowStockList = new ArrayList<>();
        
        for (Product product : allProducts){
            
            if (product.getStock() < 5){
                lowStockList.add(product);
            }
            
        }
        
        return lowStockList;  
        
    }  
    
}
