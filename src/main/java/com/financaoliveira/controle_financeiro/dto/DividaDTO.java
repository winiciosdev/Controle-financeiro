package com.financaoliveira.controle_financeiro.dto;


import java.math.BigDecimal;
import java.time.LocalDate;

public record DividaDTO(String descricao, BigDecimal valor, LocalDate dataVencimento){}
