package edu.wctc.wholesale.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;


//     customer_id int,
//    name varchar(200) not null,
//    constraint customer_pk
//        primary key (customer_id)
@Entity
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int id;

    @Column(name = "name")
    private String name;

}
