package com.financaoliveira.controle_financeiro.controller;

import com.financaoliveira.controle_financeiro.entity.Divida;
import com.financaoliveira.controle_financeiro.service.DividaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//Definindo essa classe como um controlador REST
@RequestMapping("/dividas")// Definindo um caminho base para os endpoints dessa classe
public class DividaController {

    private final DividaService dividaService;

    @Autowired// Injetando a dependência do service automaticamente
    public DividaController(DividaService dividaService){
        this.dividaService = dividaService = dividaService;
    }

    @GetMapping("/{mes}")//Definindo um endpoint GET que recene um parâmetro na URL
    public ResponseEntity<List<Divida>> listarDividas(@PathVariable String mes){
        List<Divida> dividas = dividaService.buscarPorMes(mes);
        return ResponseEntity.ok(dividas);//RetornaNDO a lista de dívidas em formato JSON
    }
}
