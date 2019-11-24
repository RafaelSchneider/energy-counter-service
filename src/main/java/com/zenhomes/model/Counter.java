package com.zenhomes.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "counters")
public class Counter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "village_name")
    private String name;
}