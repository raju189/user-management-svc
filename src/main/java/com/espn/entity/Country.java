package com.espn.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Generated;

@Data
@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Code", unique = true)
    private String code;


}
