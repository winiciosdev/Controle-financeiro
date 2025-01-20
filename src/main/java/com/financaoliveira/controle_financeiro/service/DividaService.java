package com.financaoliveira.controle_financeiro.service;

import com.financaoliveira.controle_financeiro.entity.Divida;
import com.financaoliveira.controle_financeiro.repository.DividaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DividaService {

    private final DividaRepository dividaRepository;

    public DividaService(DividaRepository dividaRepository){
        this.dividaRepository = dividaRepository;
    }

    public List<Divida> buscarPorMes(String mes){
        return dividaRepository.findByMes(mes);
    }
}
