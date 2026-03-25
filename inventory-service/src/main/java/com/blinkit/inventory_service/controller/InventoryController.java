package com.blinkit.inventory_service.controller;

import com.blinkit.inventory_service.service.InventoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService service;

    public InventoryController(InventoryService service) {
        this.service = service;
    }

    @GetMapping("/check")
    public boolean check(@RequestParam Long productId,
                         @RequestParam int qty){

        return service.checkStock(productId,qty);

    }

}