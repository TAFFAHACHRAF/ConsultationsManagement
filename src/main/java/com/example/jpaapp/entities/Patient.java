package com.example.jpaapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "Nom",length = 50)
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dataNaissance;
    private boolean malade;
    private int score;
}
