package com.blinkit.cart_service.service;

import com.blinkit.cart_service.entity.CartItem;
import com.blinkit.cart_service.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartRepository repository;

    public CartService(CartRepository repository) {
        this.repository = repository;
    }

    public CartItem add(CartItem item){
        return repository.save(item);
    }

    public List<CartItem> getUserCart(Long userId){
        return repository.findByUserId(userId);
    }

}
