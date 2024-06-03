package com.fatec.cadastro_atleta.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tb_cadastro_atleta")
public class Atleta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cd_atleta_seq")
    @SequenceGenerator(name = "cd_atleta_seq", sequenceName = "seq_cd_atleta", allocationSize = 1)
    private int cdAtleta;

    private String nmAtleta;
    private String nmSobrenome;
    private String dtNascimento;
    private String dsEndereco;
    private String sgEstado;
    private String dsTelefone;
    private String dsEmail;

    public Atleta() {
    }

    public Atleta(String nmAtleta, String nmSobrenome, String dtNascimento, String dsEndereco, String sgEstado, String dsTelefone, String dsEmail) {
        this.nmAtleta = nmAtleta;
        this.nmSobrenome = nmSobrenome;
        this.dtNascimento = dtNascimento;
        this.dsEndereco = dsEndereco;
        this.sgEstado = sgEstado;
        this.dsTelefone = dsTelefone;
        this.dsEmail = dsEmail;
    }
}
