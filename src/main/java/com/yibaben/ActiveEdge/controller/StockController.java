package com.yibaben.ActiveEdge.controller;

import com.yibaben.ActiveEdge.dto.StockRequest;
import com.yibaben.ActiveEdge.dto.StockResponse;
import com.yibaben.ActiveEdge.entity.Stock;
import com.yibaben.ActiveEdge.service.StockServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/stocks")
public class StockController {
    private final StockServices stockServices;


    @GetMapping("/getAll")
    public List<StockResponse> getAllStocks() {
        return stockServices.getAllStocks();
    }

    @GetMapping("/getById/{id}")
    public StockResponse getStockById(@PathVariable Long id) {
        return stockServices.getStockById(id);
    }

    @PutMapping("/updatePrice/{id}")
    public StockResponse updateStockPrice(@PathVariable Long id, @RequestBody StockRequest request) {
        return stockServices.updateStockPrice(id, request);
    }

    @PostMapping("/create")
    public StockResponse createStock(@RequestBody Stock newStock) {
        return stockServices.createStock(newStock);
    }

}
