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

    private String descricao;
    private BigDecimal Valor;
    private LocalDate dataVencimento;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

}
