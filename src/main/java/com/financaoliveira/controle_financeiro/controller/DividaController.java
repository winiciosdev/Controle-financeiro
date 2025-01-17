package com.financaoliveira.controle_financeiro.controller;

import com.financaoliveira.controle_financeiro.entity.Divida;
import com.financaoliveira.controle_financeiro.service.DividaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dividas")
public class DividaController {

    private final DividaService dividaService;

    public DividaController(DividaService dividaService){
        this.dividaService = dividaService = dividaService;
    }

    @GetMapping("/{usuarioId}")
    public List<Divida> listarDividas(@PathVariable Long usuarioId){
        return dividaService.listarDividasPorUsuario(usuarioId);
    }
}
