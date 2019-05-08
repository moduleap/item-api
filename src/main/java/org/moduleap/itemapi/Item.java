package org.moduleap.itemapi;


import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String desc;
    @Column
    private Timestamp creationDate;
    @Column
    private double price;
}
