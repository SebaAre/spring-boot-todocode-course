package com.sebaare.shop.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SaleDTO {
    
    private Long saleId;
    private Double total;
    private Integer productQuantity;
    private String clientFirstName;
    private String clientLastName;

    public SaleDTO() {
    }

    public SaleDTO(Long saleId, Double total, Integer productQuantity, String clientFirstName, String clientLastName) {
        this.saleId = saleId;
        this.total = total;
        this.productQuantity = productQuantity;
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
    }
    
}
