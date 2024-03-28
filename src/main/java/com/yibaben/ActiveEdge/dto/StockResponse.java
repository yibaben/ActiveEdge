package com.yibaben.ActiveEdge.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class StockResponse {
    private Long id;
    private String name;
    private BigDecimal currentPrice;
    private Date createDate;
    private Date lastUpdate;
}
