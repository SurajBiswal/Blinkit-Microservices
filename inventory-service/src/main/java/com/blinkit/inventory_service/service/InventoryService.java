package com.blinkit.inventory_service.service;

import com.blinkit.inventory_service.entity.Inventory;
import com.blinkit.inventory_service.repository.InventoryRepository;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    private final InventoryRepository repository;

    public InventoryService(InventoryRepository repository) {
        this.repository = repository;
    }

    public boolean checkStock(Long productId,int qty){

        Inventory inv = repository.findByProductId(productId)
                .orElseThrow();

        return inv.getQuantity() >= qty;

    }

}