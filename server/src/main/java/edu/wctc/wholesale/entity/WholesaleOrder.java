package edu.wctc.wholesale.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class WholesaleOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int id;

    @Column(name = "purchase_order_num")
    private String purchaseOrderNum;

    @Column(name = "terms")
    private String terms;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "purchase_date")
    private LocalDate purchaseDate;

    @Column(name = "shipped_date")
    private LocalDate shippedDate;

}