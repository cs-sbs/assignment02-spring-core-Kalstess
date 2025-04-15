package org.example;

import org.example.config.AppConfig;
import org.example.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);

        // 调用方法验证AOP
        orderService.createOrder("order1");
        orderService.updateOrderStatus("order1", "paid");

        context.close();
    }
}