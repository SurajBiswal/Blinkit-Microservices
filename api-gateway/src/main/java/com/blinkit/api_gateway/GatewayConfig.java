package com.blinkit.api_gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                // USER SERVICE
                .route("user-service", r -> r
                        .path("/users/**")
                        .uri("lb://user-service"))
                
                // PRODUCT SERVICE
                .route("product-service", r -> r
                        .path("/products/**")
                        .uri("lb://product-service"))
                
                // CART SERVICE
                .route("cart-service", r -> r
                        .path("/cart/**")
                        .uri("lb://cart-service"))
                
                // ORDER SERVICE
                .route("order-service", r -> r
                        .path("/orders/**")
                        .uri("lb://order-service"))
                
                // INVENTORY SERVICE
                .route("inventory-service", r -> r
                        .path("/inventory/**")
                        .uri("lb://inventory-service"))
                
                // PAYMENT SERVICE
                .route("payment-service", r -> r
                        .path("/payments/**")
                        .uri("lb://payment-service"))
                
                .build();
    }
}
