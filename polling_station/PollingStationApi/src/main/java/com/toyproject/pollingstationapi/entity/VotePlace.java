package com.toyproject.pollingstationapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class VotePlace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increase
    private Long id;

    @Column(nullable = false)
    private Double posX;

    @Column(nullable = false)
    private Double posY;

    @Column(nullable = false, length = 100)
    private String addressKor;

    @Column(nullable = false)
    private String phone;
}
