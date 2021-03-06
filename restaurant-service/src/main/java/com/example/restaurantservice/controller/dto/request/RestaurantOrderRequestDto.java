package com.example.restaurantservice.controller.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.dto.restaurant.RestaurantOrderStatus;

import javax.validation.constraints.NotNull;
import java.util.UUID;


@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantOrderRequestDto {

    @NotNull
    private UUID restaurantOrderId;

    @NotNull
    private RestaurantOrderStatus restaurantStatus;

}
