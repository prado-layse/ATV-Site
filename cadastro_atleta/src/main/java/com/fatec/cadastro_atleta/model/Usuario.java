package com.fatec.cadastro_atleta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.GenerationType;

@Setter
@Getter
@Entity
public class Usuario {
    // Getters e Setters
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;

    // Construtor com argumentos
    public Usuario(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
