package com.example.ordersservice.service;

import dto.OrderDto;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    List<OrderDto> getOrdersByCustomerId(UUID customerId);
    OrderDto createOrder(OrderDto dto);
    OrderDto updateOrder(OrderDto dto);

}