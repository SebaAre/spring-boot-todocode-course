package com.sebaare.shop.controller;

import com.sebaare.shop.model.Product;
import com.sebaare.shop.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    
    //CREATE
    @PostMapping("/create")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
    
    //READ - Get all products
    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }
    
    //READ - Get a specific product by Code
    @GetMapping("/{productCode}")
    public Product getProduct(@PathVariable Long productCode){
        return productService.getProduct(productCode);
    }
    
    
    //UPDATE
    @PutMapping("/edit/{productCode}")
    public Product editProduct(@PathVariable Long productCode,
                               @RequestBody Product product){
        
        product.setProductCode(productCode);
        return productService.editProduct(product);
    }
    
    
    //DELETE
    @DeleteMapping("/delete/{productCode}")
    public String deleteProduct(@PathVariable Long productCode){
        productService.deleteProduct(productCode);
        return "Product deleted successfully";
    }
    
    
    //CUSTOM - Get products with low stock (< 5)
    @GetMapping("/low_stock")
    public List<Product> getLowStockProducts(){
        return productService.getLowStockProducts();
    }
    
   
}
