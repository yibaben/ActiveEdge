package com.yibaben.ActiveEdge.service;

import com.yibaben.ActiveEdge.dto.StockRequest;
import com.yibaben.ActiveEdge.dto.StockResponse;
import com.yibaben.ActiveEdge.entity.Stock;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class StockServices {
    private List<Stock> stocks = new ArrayList<>();

    public StockServices() {
        // Initialize stocks in memory on application startup
        stocks.add(new Stock(1L, "Rice", new BigDecimal("100.00"), new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis())));
        stocks.add(new Stock(2L, "Beans", new BigDecimal("50.00"), new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis())));
        stocks.add(new Stock(3L, "Wheat", new BigDecimal("80.00"), new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis())));
        stocks.add(new Stock(4L, "Yam", new BigDecimal("120.00"), new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis())));
        stocks.add(new Stock(5L, "Potato", new BigDecimal("60.00"), new Date(System.currentTimeMillis()), new Date(System.currentTimeMillis())));
    }

    public List<StockResponse> getAllStocks() {
        List<StockResponse> stockResponses = new ArrayList<>();
        for (Stock stock : stocks) {
            stockResponses.add(mapStockToResponse(stock));
        }
        return stockResponses;
    }

    public StockResponse getStockById(Long id) {
        Stock stock = findStockById(id);
        if (stock != null) {
            return mapStockToResponse(stock);
        }
        return null; // Stock not found
    }

    public StockResponse updateStockPrice(Long id, StockRequest request) {
        Stock stock = findStockById(id);
        if (stock != null) {
            stock.setCurrentPrice(request.getCurrentPrice());
            return mapStockToResponse(stock);
        }
        return null; // Stock not found
    }

    public StockResponse createStock(Stock newStock) {
        stocks.add(newStock);
        return mapStockToResponse(newStock);
    }

    private Stock findStockById(Long id) {
        for (Stock stock : stocks) {
            if (stock.getId().equals(id)) {
                return stock;
            }
        }
        return null; // Stock not found
    }

    private StockResponse mapStockToResponse(Stock stock) {
        StockResponse response = new StockResponse();
        response.setId(stock.getId());
        response.setName(stock.getName());
        response.setCurrentPrice(stock.getCurrentPrice());
        response.setCreateDate(stock.getCreateDate());
        response.setLastUpdate(stock.getLastUpdate());
        return response;
    }
}
