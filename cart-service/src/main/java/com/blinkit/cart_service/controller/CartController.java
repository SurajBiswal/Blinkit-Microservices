package com.blinkit.cart_service.controller;

import com.blinkit.cart_service.entity.CartItem;
import com.blinkit.cart_service.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @PostMapping
    public CartItem add(@RequestBody CartItem item){
        return service.add(item);
    }

    @GetMapping("/{userId}")
    public List<CartItem> getCart(@PathVariable Long userId){
        return service.getUserCart(userId);
    }

}