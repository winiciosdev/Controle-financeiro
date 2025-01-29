package com.financaoliveira.controle_financeiro.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "dividas")
@Data
public class Divida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String descricao;
    
    private BigDecimal Valor;
    private LocalDate dataVencimento;

    @Column(nullable = false)
    private String mesReferencia;


    //Relacionado com usuario
    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)// Definindo que o campo não pode ser nulo
    private Usuario usuario;

}
