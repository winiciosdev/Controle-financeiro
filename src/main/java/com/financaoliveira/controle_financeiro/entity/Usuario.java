package com.financaoliveira.controle_financeiro.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.ArrayList;
@Entity
@Table(name = "Usuarios")// Definindo a tabela no banco
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id//Sinalizando que o atributo é ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Gera automaticamente o ID
    private long id;

    private String nome;

    @Column(nullable = false, unique = true)//Não permitindo que o valor seja nulo e permitindo que o valor inserido seja unico.
    private String email;

    @Column(nullable = false)//sinalizando que o campo senha não pode ser nulo.
    private String senha;

    /*
    comentado até saber a necessidade dos Getters e Setters após a inclusão das anotações
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


     */

    //Criando relacionamento com Divida
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private  List<Divida> dividas = new ArrayList<>();
}
