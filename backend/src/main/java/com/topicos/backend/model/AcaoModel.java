package com.topicos.backend.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="AcaoModel")
public class AcaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;


}
