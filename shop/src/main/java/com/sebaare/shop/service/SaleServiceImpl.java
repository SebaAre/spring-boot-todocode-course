package com.sebaare.shop.service;

import com.sebaare.shop.dto.SaleDTO;
import com.sebaare.shop.model.Client;
import com.sebaare.shop.model.Product;
import com.sebaare.shop.model.Sale;
import com.sebaare.shop.repository.ClientRepository;
import com.sebaare.shop.repository.ProductRepository;
import com.sebaare.shop.repository.SaleRepository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SaleServiceImpl implements SaleService {
    
    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private ProductRepository productRepository;  
    
    @Autowired
    private ClientRepository clientRepository; 

    @Override
    public Sale createSale(Sale sale) {
        // Load full Product entities from database
        List<Product> fullProducts = new ArrayList<>();
        for (Product product : sale.getProducts()) {
            Product fullProduct = productRepository.findById(product.getProductCode()).orElse(null);
            if (fullProduct != null) {
                fullProducts.add(fullProduct);
            }
        }
        sale.setProducts(fullProducts);
        
        // Load full Client entity from database
        if (sale.getClient() != null && sale.getClient().getClientId() != null) {
            Client fullClient = clientRepository.findById(sale.getClient().getClientId()).orElse(null);
            sale.setClient(fullClient);
        }
        
        return saleRepository.save(sale);
    }

    @Override
    public List<Sale> getSales() {
        return saleRepository.findAll();
    }

    @Override
    public Sale getSale(Long saleId) {
        return saleRepository.findById(saleId).orElse(null);
    }

    @Override
    public Sale editSale(Sale sale) {
        return saleRepository.save(sale);
    }

    @Override
    public void deleteSale(Long saleId) {
        saleRepository.deleteById(saleId);
    }

    @Override
    public List<Product> getProductsBySale(Long saleId) {
        
        // Get the sale by ID
        Sale sale = this.getSale(saleId);
        
        // Return the list of products 
        if (sale != null) {
            return sale.getProducts();
        }
        
        // Return empty list if sale doesn't exist
        return new ArrayList<>();
        
    }

    @Override
    public String getSalesByDate(LocalDate saleDate) {
        
        // Get all sales
        List<Sale> allSales = this.getSales();
  
        // Variables to store totals
        Double totalAmount = 0.0;
        Integer totalSales = 0;
        
        // Filter sales by date manually
        for (Sale sale : allSales) {
            if (sale.getSaleDate().equals(saleDate)) {
                totalAmount += sale.getTotal();
                totalSales++;
            }
        }
        
        // Return formatted string with results
        
        return "Date: " + saleDate + 
               " | Total Amount: $" + totalAmount + 
               " | Total Sales: " + totalSales;
       
    }

    @Override
    public SaleDTO getHighestSale() {
        
        // Get all sales
        List<Sale> allSales = this.getSales();
        
        // Variable to store the highest sale
        Sale highestSale = null;
        Double maxTotal = 0.0;
        
        // Find the sale with the highest total
        for (Sale sale : allSales) {
            if (sale.getTotal() > maxTotal) {
                maxTotal = sale.getTotal();
                highestSale = sale;
            }
        }
        
        // Create and populate the DTO manually
        if (highestSale != null) {
            SaleDTO dto = new SaleDTO();
            
            dto.setSaleId(highestSale.getSaleId());
            dto.setTotal(highestSale.getTotal());
            dto.setProductQuantity(highestSale.getProducts().size());
            dto.setClientFirstName(highestSale.getClient().getFirstName());
            dto.setClientLastName(highestSale.getClient().getLastName());
            
            return dto;
        }
        
        // Return null if no sales exist
        return null;
    }
    
}
