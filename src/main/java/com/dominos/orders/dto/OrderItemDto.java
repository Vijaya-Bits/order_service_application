package com.dominos.orders.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDto {
	private Integer productId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private String itemName;
}
