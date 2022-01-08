package org.example.dto.restaurant.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class DishRequestDto implements Serializable {

    @NotNull
    private UUID dishId;

    @Min(0)
    @NotNull
    private BigDecimal cost;

    @Min(1)
    @NotNull
    private Integer quantity;

}