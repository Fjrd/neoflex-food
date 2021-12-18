package com.example.ordersservice.service;

import org.example.dto.order.message.OrderMessageDto;
import org.example.dto.order.request.OrderRequestDto;
import org.example.dto.order.response.OrderResponseDto;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    List<OrderResponseDto> getOrdersByCustomerId(UUID customerId);
    OrderResponseDto createOrder(UUID customerId, OrderRequestDto clientOrderDto);
    OrderResponseDto updateOrder(UUID customerId, OrderRequestDto clientOrderDto);
    void updateOrder(OrderMessageDto fullOrderDto);
}
