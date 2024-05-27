package com.fatec.cadastro_atleta.service;

import com.fatec.cadastro_atleta.model.Atleta;
import com.fatec.cadastro_atleta.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtletaService {

    @Autowired
    private AtletaRepository atletaRepository;

    public void inserirAtleta(Atleta atleta) {
        atletaRepository.save(atleta);
    }

    public List<Atleta> listarAtletas() {
        return atletaRepository.findAll();
    }
}
