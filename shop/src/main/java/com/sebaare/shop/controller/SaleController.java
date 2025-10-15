package com.sebaare.shop.controller;

import com.sebaare.shop.dto.SaleDTO;
import com.sebaare.shop.model.Product;
import com.sebaare.shop.model.Sale;
import com.sebaare.shop.service.SaleService;
import java.time.LocalDate;
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
@RequestMapping("/sales")
public class SaleController {
    
    @Autowired
    private SaleService saleService;
    
    //CREATE
    @PostMapping("/create")
    public Sale createSale(@RequestBody Sale sale){
        return saleService.createSale(sale);
    }
    
    //READ - Get all sales
    @GetMapping
    public List<Sale> getSales(){
        return saleService.getSales();
    }
    
    //READ - Get sale by specific ID
    @GetMapping("/{saleId}")
    public Sale getSale(@PathVariable Long saleId){
        return saleService.getSale(saleId);
    }
    
    //UPDATE
    @PutMapping("/edit/{saleId}")
    public Sale editSale(@PathVariable Long saleId,
                         @RequestBody Sale sale){
        
        sale.setSaleId(saleId);
        return saleService.editSale(sale);
    }
    
    //DELETE
    @DeleteMapping("/delete/{saleId}")
    public String deleteSale(@PathVariable Long saleId){
        
        saleService.deleteSale(saleId);
        return "Sale deleted successfully";
    }
    
    //CUSTOM - Get products from a specific sale
    @GetMapping("/products/{saleId}")
    public List<Product> getProductsBySale(@PathVariable Long saleId){
        return saleService.getProductsBySale(saleId);
    }
    
    
    //CUSTOM - Get sales data by date
    @GetMapping("/date/{saleDate}")
    public String getSalesByDate(@PathVariable LocalDate saleDate){
        return saleService.getSalesByDate(saleDate);
    }
    
    
    
    //CUSTOM - Get the highest sale (DTO)
    @GetMapping("/highest_sale")
    public SaleDTO getHighestSale(){
        return saleService.getHighestSale();
    }
    
    
    
}

