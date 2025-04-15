package org.example.service;

import org.springframework.stereotype.Service;

@Service // 注解方式注册Bean
public class OrderService {

    public void createOrder(String orderId) {
        System.out.println("创建订单: " + orderId);
    }

    public void updateOrderStatus(String orderId, String status) {
        System.out.println("更新订单状态: " + orderId + " -> " + status);
    }
}