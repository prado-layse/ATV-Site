package com.fatec.cadastro_atleta.model;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class AtletaDAO {

    @Autowired
    DataSource dataSource;

    JdbcTemplate jdbc;

    @PostConstruct
    private void initialize() {
        jdbc = new JdbcTemplate(dataSource);
    }

    public void inserirAtleta(Atleta atleta) {
        String sql = "INSERT INTO tb_cadastro_atleta (nm_atleta, nm_sobrenome, dt_nascimento, ds_endereco, sg_estado, ds_telefone, ds_email) VALUES (?,?,?,?,?,?,?)";

        Object[] obj = new Object[7];
        obj[0] = atleta.getNmAtleta();
        obj[1] = atleta.getNmSobrenome();
        obj[2] = atleta.getDtNascimento();
        obj[3] = atleta.getDsEndereco();
        obj[4] = atleta.getSgEstado();
        obj[5] = atleta.getDsTelefone();
        obj[6] = atleta.getDsEmail();

        jdbc.update(sql, obj);
    }

    public List<Map<String, Object>> listarAtletas() {
        String sql = "SELECT * FROM tb_cadastro_atleta";
        return jdbc.queryForList(sql);
    }
}
