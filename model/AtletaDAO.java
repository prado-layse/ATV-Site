package com.atv.siteatv.model;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

//Toda classe DAO deve ser anotada com @Repository
@Repository
public class AtletaDAO {

    @Autowired
    DataSource dataSource;
    
    JdbcTemplate jdbc;

    @PostConstruct
    private void initialize(){
        jdbc = new JdbcTemplate(dataSource);
    }

    public void inserirAtleta(Atleta atleta){
        String sql = "INSERT INTO tb-atletas(nome,cpf,dataNasc,endereco,telefone,email)" + 
        " VALUES (?,?,?,?,?,?)";

        Object[] obj = new Object[6];
        obj[0] = atleta.getNome();
        obj[1] = atleta.getCPF();
        obj[2] = atleta.getDataNasc();
        obj[3] = atleta.getEndereco();
        obj[4] = atleta.getTelefone();
        obj[5] = atleta.getEmail();

        jdbc.update(sql, obj);
    }

    public List<Map<String, Object>> listarAtletas(){
       String sql = "SELECT * FROM tb-atletas";
       return jdbc.queryForList(sql); 
    }
}
