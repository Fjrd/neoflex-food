package com.example.ordersservice.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@NoArgsConstructor
@Builder(toBuilder = true)
@Entity
@Table(name = "customers")
public class Customer{

    @Id
    @Column(name = "customer_id", nullable = false)
    private UUID customerId;

}