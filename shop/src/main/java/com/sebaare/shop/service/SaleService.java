package com.sebaare.shop.service;

import com.sebaare.shop.dto.SaleDTO;
import com.sebaare.shop.model.Product;
import com.sebaare.shop.model.Sale;
import java.time.LocalDate;
import java.util.List;


public interface SaleService {
    
    //CREATE
    public Sale createSale(Sale sale);
    
    //READ
    public List<Sale> getSales();
    public Sale getSale(Long saleId);
    
    //UPDATE
    public Sale editSale(Sale sale);
    
    //DELETE
    public void deleteSale(Long saleId);
    
    //CUSTOM - Get products from a specific sale
    public List<Product> getProductsBySale(Long saleId);
    
    //CUSTOM - Get sales summary by date (total amount and quantity)
    public String getSalesByDate(LocalDate saleDate);
   
    //CUSTOM - Get the highest sale (with DTO)
    public SaleDTO getHighestSale();
    
}
