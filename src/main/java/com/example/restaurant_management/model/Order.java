package com.example.restaurant_management.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order_table")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer orderId;

    private Integer quantity;

    @Enumerated(EnumType.STRING)
    private status status;

    @ManyToOne
    @JoinColumn(name = "fk-user_id")
    private User user;

}
