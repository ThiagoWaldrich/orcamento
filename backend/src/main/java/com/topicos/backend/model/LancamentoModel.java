package com.topicos.backend.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="tbLancamentos")
public class LancamentoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

}
