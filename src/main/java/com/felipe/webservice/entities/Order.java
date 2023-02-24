package com.felipe.webservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
@Entity
@AllArgsConstructor
@Table(name = "tb_order")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    public Order() {
    }
//   private OrderStatus orderStatus;

}
