package com.yibaben.ActiveEdge.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Stock {
    private Long id;
    private String name;
    private BigDecimal currentPrice;
    private Date createDate;
    private Date lastUpdate;

}
