package org.example.dto.restaurant.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.example.dto.payment.PaymentStatus;
import org.example.dto.restaurant.RestaurantOrderStatus;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class RestaurantOrderMessageDto implements Serializable {

    @NotNull
    private UUID orderId;

    @NotNull
    private UUID customerId;

    @NotNull
    private LocalDateTime orderTime;

    @NotNull
    private Integer orderCounter;

    @Min(0)
    @NotNull
    private BigDecimal orderTotalCost;

    @NotBlank
    private Set<DishMessageDto> dishesList;

    @NotNull
    private PaymentStatus paymentStatus;

    @NotNull
    private RestaurantOrderStatus restaurantStatus;

}