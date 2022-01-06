package org.example.dto.delivery;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeliveryStatus {

    UNPROCESSED("Delivery has not been processed yet"),
    ACCEPTED("Delivery accepted"),
    IN_PROGRESS("Order is on the way"),
    SUCCESS("Delivery completed successfully");

    private String statusText;

}
