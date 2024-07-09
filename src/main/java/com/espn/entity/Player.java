package com.espn.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Generated;


@Data
@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String status;

    @OneToOne
    @JoinColumn(name = "id")
    private Country country;
}
